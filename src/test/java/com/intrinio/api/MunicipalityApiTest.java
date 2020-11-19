

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseMunicipalities;
import com.intrinio.models.ApiResponseMunicipalitiyFinancials;
import java.math.BigDecimal;
import com.intrinio.models.Municipality;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MunicipalityApi
 */
@Ignore
public class MunicipalityApiTest {

    private final MunicipalityApi api = new MunicipalityApi();

    
    /**
     * All Municipalities
     *
     * Returns all Municipalities. When parameters are specified, returns matching municipalities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMunicipalitiesTest() throws ApiException, NoSuchMethodException {
        Boolean hasFinancials = null;
        String governmentName = null;
        String governmentType = null;
        String areaName = null;
        String areaType = null;
        String city = null;
        String state = null;
        BigDecimal zipcode = null;
        BigDecimal populationGreaterThan = null;
        BigDecimal populationLessThan = null;
        BigDecimal enrollmentGreaterThan = null;
        BigDecimal enrollmentLessThan = null;
        String nextPage = null;
        ApiResponseMunicipalities response = api.getAllMunicipalities(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage);

        // TODO: test validations
    }
    
    /**
     * Municipality by ID
     *
     * Returns the Municipality with the given ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMunicipalityByIdTest() throws ApiException, NoSuchMethodException {
        String id = null;
        Municipality response = api.getMunicipalityById(id);

        // TODO: test validations
    }
    
    /**
     * Financials for a Municipality
     *
     * Returns financial statement data for the Municipality with the given ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMunicipalityFinancialsTest() throws ApiException, NoSuchMethodException {
        String id = null;
        BigDecimal fiscalYear = null;
        ApiResponseMunicipalitiyFinancials response = api.getMunicipalityFinancials(id, fiscalYear);

        // TODO: test validations
    }
    
}
