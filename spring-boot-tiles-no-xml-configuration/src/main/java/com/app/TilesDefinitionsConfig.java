package com.app;

import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.request.Request;

public class TilesDefinitionsConfig implements DefinitionsFactory {

	private static final Map<String, Definition> tilesDefinitions = new HashMap<String, Definition>();
	private static final Attribute BASE_TEMPLATE = new Attribute("/WEB-INF/jsp/layout/defaultLayout.jsp");

	@Override
	public Definition getDefinition(String name, Request tilesContext) {
		return tilesDefinitions.get(name);
	}

	private static void addDefaultLayoutDef(String name, String title, String body) {
		Map<String, Attribute> attributes = new HashMap<String, Attribute>();
		attributes.put("header", new Attribute("/WEB-INF/jsp/layout/header.jsp"));
		attributes.put("body", new Attribute(body));
		attributes.put("footer", new Attribute("/WEB-INF/jsp/layout/footer.jsp"));
		tilesDefinitions.put(name, new Definition(name, BASE_TEMPLATE, attributes));
	}

	public static void addDefinitions() {
		addDefaultLayoutDef("dashboard", "Dashboard", "/WEB-INF/jsp/view/dashboard.jsp");
	}

}
