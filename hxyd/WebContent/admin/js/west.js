function initWest() {
	var west = new Ext.Panel({
		region : 'west',
		stateId : 'navigation-panel',
		id : 'west-panel', // see Ext.getCmp() below
		title : '功能导航',
		split : true,
		width : 200,
		minWidth : 175,
		maxWidth : 400,
		collapsible : true,
		animCollapse : true,
		margins : '0 0 0 5',
		layout : 'accordion',
		items : [ {
			contentEl : 'west',
			title : 'Spider',
			iconCls : 'nav' // see the HEAD section for style used
		}, {
			title : 'Settings',
			html : '<p>Some settings in here.</p>',
			iconCls : 'settings'
		}, {
			title : 'Information',
			html : '<p>Some info in here.</p>',
			iconCls : 'info'
		} ]
	});
	return west;
};