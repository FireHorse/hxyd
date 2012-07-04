function initChart(){
    var generateData = (function() {
        var data = [], i = -1;
        return function() {
            //data = data.slice();
            var result = ajaxSyncCall('../action/MonitorInfo!getCurrentInfo');
			result = Ext.JSON.decode(result);
			if(data.length>=10&&data.length%10==0){
				data=[];
			}  
            data.push({
            	'MemoryRatio':result.MemoryRatio,
            	'Time':i+=1
            });      
            return data;
        };
    })();
	var store = Ext.create('Ext.data.JsonStore', {
		fields : [ 'MemoryRatio', 'Time' ],
		data : generateData()
	});
	var intr = setInterval(function() {
    	var gs = generateData();
   	    var g = timeAxis.maximum;
   		var l = gs[gs.length - 1].Time;
    	markerIndex = chart.markerIndex || 0;
    	if(l>=g){
    		timeAxis.minimum += 1;
    		timeAxis.maximum = l;
  	    };
    	store.loadData(gs);
	}, 1000);
	//创建窗口
	var y = {//
		type : 'Numeric',
		grid : false,
		minimum : 0,
		maximum : 100,
		position : 'left',
		fields : [ 'MemoryRaito' ],
		title : '',
		//表格背景相间变色
		grid : {
			odd : {
				//fill : '#dedede',
				stroke : '#ddd',//分隔线
				'stroke-width' : 0.5//分隔线的宽度
			}
		}
	};
	var x = {//
		type : 'Numeric',
		//grid : true,
		minimum : 0,
		maximum : 10,
		//majorTickSteps:10,
		//minorTickSteps:10,
		position : 'bottom',
		fields : [ 'Time' ],
		title : '',
		
		label:{
			rotate:{
				degrees:315
			},
			font : {  
                    name : '宋体',  
                    color : '#ffffff',  
                    size : 6                      
            } 
		}
		
	};
	var eastchart = Ext.create('Ext.chart.Chart	',{
		id:'eastchart',
		xtype:'chart',
		animate:true,//开启动画效果
		store:store,
		axes:[y,x]
	});
	//_chart = Ext.getCmp('chartCmp');
	var timeAxis = eastchart.axes.get(1);
	return eastchart;
}
