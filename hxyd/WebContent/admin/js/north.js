function initNorth(){
	var north=Ext.create('Ext.Component', {
        region: 'north',
        height: 50,
        autoEl: {
            tag: 'div',
            contentEl:'logo',
        }
    });
	return north;
};