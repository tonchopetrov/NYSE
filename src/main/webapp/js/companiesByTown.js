/**
 * Created by TT on 9.11.2015 г..
 */


$(document).ready(function () {

    var doRequestResponce = function (id, url) {

        $("#" + id).change(function () {
            $("#countCompanies").html("");

            var country = $("#"+id).val();
            if (country != "All Countries") {
                $.ajax({
                    type: "POST",
                    contentType: "json",
                    url: "action/"+url+country,
                    //data: companyData.serialize(),
                    success: function (data) {
                        $("#countCompanies").html("Displaying " + data.length + " results");
                        emptyCompanyTable();
                        var table = $("#companiesTable");
                        fillTable(table, data);
                    },
                    error: function () {
                        window.console(arguments);
                    }
                });
            }
        });
    };

    var companyUrl = "companiesInCountry";

    doRequestResponce("euroCountryValue", companyUrl);
    doRequestResponce("africaCountryValue",companyUrl);
    doRequestResponce("asiaCountryValue",companyUrl);
    doRequestResponce("australiaAndSouthPacificCountryValue",companyUrl);
    doRequestResponce("americaAndCaribbeanCountryValue",companyUrl);
    doRequestResponce("southAmericaCountryValue",companyUrl);
    doRequestResponce("middleEastCountryValue",companyUrl);
    doRequestResponce("northAmericaCountryValue",companyUrl);

});


