function addTab(id, title,tabpanel) {
	var n = tabpanel.getComponent(id);
	if (n) {
		tabpanel.setActiveTab(n);
	} else {
		tabpanel.add({
			id : id,
			closable : true,
			autoScroll : true,
			html : 'Tab Body ' + '<br/><br/>',
			iconCls : 'tabs',
			title : title
		}).show();
	}

}