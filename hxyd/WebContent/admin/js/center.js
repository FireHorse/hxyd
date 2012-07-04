function initCenter() {
	var center = Ext.createWidget('tabpanel', {
		region : 'center', // a center region is ALWAYS required for border							// layout
		defaults : {
			autoScroll : true,
			bodyPadding : 10,
		},
		activeTab : 0, // first tab initially active
		items : [ {
			id : 'sysInfo',
			contentEl : 'center2',
			title : '起始页',
			autoScroll : true
		}]

	});
	return center;
};