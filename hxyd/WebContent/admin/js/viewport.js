function initViewport(parts) {
	var viewport = Ext.create('Ext.Viewport', {
		id : 'border-example',
		layout : 'border',
		items :parts,
	});
	return viewport;
};