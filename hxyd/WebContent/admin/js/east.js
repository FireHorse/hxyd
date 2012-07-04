function initEast() {
	// var result = ajaxSyncCall('../action/MonitorInfo!getCurrentInfo');
	sysBaseInfo = Ext.create('Ext.grid.PropertyGrid', {
				title : '基本信息',
				autoscroll : true,
				source:{}
				//source : Ext.JSON
				//		.decode(ajaxSyncCall('../action/MonitorInfo!getStaticInfo'))
			});
	sysInfo = Ext.create('Ext.grid.PropertyGrid', {
				title : '实时信息',
				source : {}
			});
	function loadEastData() {
		//var jsonData = Ext.JSON
		//		.decode(ajaxSyncCall('../action/MonitorInfo!getCurrentInfo'));
		//sysInfo.setSource(jsonData);
	}
	// loadEastData();
	setInterval(loadEastData, 5000);
	sysInfo.on('beforeedit', function(e) {
				e.cancel = true;
				return false;
			});
	sysBaseInfo.on('beforeedit', function(e) {
				e.cancel = true;
				return false;
			});
	var east = Ext.createWidget('tabpanel', {
				region : 'east',
				title : '系统信息',
				dockedItems : [{
							dock : 'top',
							xtype : 'toolbar',
							items : ['->', {
										xtype : 'button',
										text : '刷新',
										tooltip : 'Test Button'
									}]
						}],
				animCollapse : true,
				collapsible : true,
				split : true,
				width : 250, // give east and west regions a width
				minSize : 175,
				maxSize : 400,
				margins : '0 5 0 0',
				activeTab : 0,
				tabPosition : 'bottom',
				autoScroll:true,//自动滚动
				items : [sysBaseInfo, sysInfo]
			});
	return east;
};