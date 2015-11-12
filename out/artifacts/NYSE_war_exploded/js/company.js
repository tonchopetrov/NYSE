/**
 * Created by TT on 10.11.2015 г..
 */
$(document).ready(function(){

   function getCompany(data){

        $("#countCompanies").html("!!!!!!!! "+data.symbol);
        $.ajax({
            type: "GET",
            contentType:"application/json",
            url: "action/getCompanyBySymbol",
            data: data.serialize(),
            success : function(data){
            },
            error : function(){
                window.console(arguments);
            }
        });
    }
});
