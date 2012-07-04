function initSouth() {
	var south = new Ext.Panel({
		// lazily created panel (xtype:'panel' is default)
		region : 'south',
		contentEl : 'south',
		split : true,
		height : 100,
		minSize : 100,
		maxSize : 200,
		collapsible : true,
		collapsed : false,
		title : '控制台',
		margins : '0 0 0 0'
	});
	return south;
};