/**
 * Created by TT on 8.11.2015 г..
 */
$(document).ready(function () {

    var doRequestResponce = function(id,url){
        $("#"+id).click(function(){
            window.industry = $("#"+id).html();
            $("#region").hide();
            $("#industry").show();
            $("#industry").html("Industry: "+$("#"+id).html());
            hideAndShowDivs("null");
            $.ajax({
                type: "GET",
                contentType:"application/json",
                url: "action/"+url,
                data: "",
                success : function(data){
                        $("#countCompanies").html("Displaying "+data.length+" results");
                        emptyCompanyTable();
                        var table = $("#companiesTable");
                        fillTable(table,data);
                },
                error : function(){
                    window.console(arguments);
                }
            });
        });
    };


    $.ajax({
        type: "GET",
        contentType:"application/json",
        url: "action/loadSectorTechnology",
        data: "",
        success : function(data){
            $("#countCompanies").html("Displaying "+data.length+" results");
            emptyCompanyTable();
            var table = $("#companiesTable").children();
            fillTable(table,data);
        },
        error : function(){
            window.console(arguments);
        }
    });

    doRequestResponce("technology","loadSectorTechnology");
    doRequestResponce("capitalGoods","loadCapitalGoods");
    doRequestResponce("basicIndustries","loadBasicIndustry");
    doRequestResponce("consumerDurables","loadConsumerDurables");
    doRequestResponce("consumerNonDur","loadConsumerNonDur");
    doRequestResponce("consumerService","loadConsumerService");
    doRequestResponce("energy","loadEnergy");
    doRequestResponce("finance","loadFinance");
    doRequestResponce("healthCare","loadHealthCare");
    doRequestResponce("miscellaneous","/loadMiscellaneous");
    doRequestResponce("publicUtilities","loadPublicUtilities");
    doRequestResponce("transportation","loadTransportation");

});