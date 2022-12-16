
CREATE TABLE DBS01FilingInfo_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
    StartDateField VARCHAR(255),
    StartDateValue VARCHAR(255),
    EndDateField VARCHAR(255),
    EndDateValue VARCHAR(255),
    InstantDateField VARCHAR(255),
    InstantDateValue VARCHAR(255),
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS01FilingInfo_Layout2Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
    StartDateField VARCHAR(255),
    StartDateValue VARCHAR(255),
    EndDateField VARCHAR(255),
    EndDateValue VARCHAR(255),
    InstantDateField VARCHAR(255),
    InstantDateValue VARCHAR(255),
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS01DBS01AddInfo_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
    StartDateField VARCHAR(255),
    StartDateValue VARCHAR(255),
    EndDateField VARCHAR(255),
    EndDateValue VARCHAR(255),
    InstantDateField VARCHAR(255),
    InstantDateValue VARCHAR(255),
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS01DBS01FS_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
        ParameterAxis VARCHAR(255),
    
    StartDateField VARCHAR(255),
    StartDateValue VARCHAR(255),
    EndDateField VARCHAR(255),
    EndDateValue VARCHAR(255),
    InstantDateField VARCHAR(255),
    InstantDateValue VARCHAR(255),
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS01DBS01FS_Layout2Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
        ParameterAxis VARCHAR(255),
    
    StartDateField VARCHAR(255),
    StartDateValue VARCHAR(255),
    EndDateField VARCHAR(255),
    EndDateValue VARCHAR(255),
    InstantDateField VARCHAR(255),
    InstantDateValue VARCHAR(255),
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS01DBS01FS_Layout3Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
        TierCapitalDimension VARCHAR(255),
    
        TypeOfBalanceAxis VARCHAR(255),
    
        TierCapitalClassificationAxis VARCHAR(255),
    
        TypeOfLoansAndAdvancesAxis VARCHAR(255),
    
        TypeOfEconomiesAxis VARCHAR(255),
    
        DevelopingCountryListAxis VARCHAR(255),
    
        GeographicalLocationAxis VARCHAR(255),
    
    StartDateField VARCHAR(255),
    StartDateValue VARCHAR(255),
    EndDateField VARCHAR(255),
    EndDateValue VARCHAR(255),
    InstantDateField VARCHAR(255),
    InstantDateValue VARCHAR(255),
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

CREATE TABLE DBS01DBS01OFC_Layout1Entity (
    id BIGINT IDENTITY PRIMARY KEY,
    
    
        AssetLiabilityAxis VARCHAR(255),
    
        TypeOfLoansAndAdvancesAxis VARCHAR(255),
    
    StartDateField VARCHAR(255),
    StartDateValue VARCHAR(255),
    EndDateField VARCHAR(255),
    EndDateValue VARCHAR(255),
    InstantDateField VARCHAR(255),
    InstantDateValue VARCHAR(255),
    FieldName VARCHAR(255),
    FieldValue VARCHAR(255) 
);

