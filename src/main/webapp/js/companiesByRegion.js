/**
 * Created by TT on 10.11.2015 г..
 */
$(document).ready(function () {

    var doRequestResponce = function(id,url,divName){
        $("#"+id).click(function(){
            $("#region").show();
            $("#region").html("Region: "+$("#"+id).html());
            $("#industry").hide();

            hideAndShowDivs(divName);

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
                    window.log("Data: "+data.length);
                    $("#region").html("data lengh: "+data.length);
                },
                error : function(){
                    window.console(arguments);
                }
            });
        });
    };


    doRequestResponce("africa","fromAfrica","africaCountriesDiv");
    doRequestResponce("asia","fromAsia","asiaCountriesDiv");
    doRequestResponce("australiaAndSouthPacific","fromAustraliaAndSouthPacific","australiaAndSouthPacificCountriesDiv");
    doRequestResponce("americaAndCaribbean","fromCentralAmericaAndCaribbean","americaAndCaribbeanCountriesDiv");
    doRequestResponce("europe","fromEurope","europeCountriesDiv");
    doRequestResponce("southAmerica","fromSouthAmerica","southAmericaCountriesDiv");
    doRequestResponce("middleEast","fromMiddleEast","middleEastCountriesDiv");
    doRequestResponce("nortAmerica","fromNortAmerica","northAmericaCountriesDiv");

});
