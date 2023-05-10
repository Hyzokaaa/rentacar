﻿-- GETTERS FUNCTIONS

-- GET ALL AUXILIAR
CREATE OR REPLACE FUNCTION get_situations() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'situations';
BEGIN
	OPEN result FOR
	SELECT name FROM situation;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_paymethods() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'paymethods';
BEGIN
	OPEN result FOR
	SELECT name FROM pay_method;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_brands() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'brands';
BEGIN
	OPEN result FOR
	SELECT name FROM brand;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_countries() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'countries';
BEGIN
	OPEN result FOR
	SELECT name FROM country;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_categories() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'categories';
BEGIN
	OPEN result FOR
	SELECT name FROM category;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_models() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'models';
BEGIN
	OPEN result FOR
	SELECT name FROM model;
	RETURN result;
END; $$
LANGUAGE plpgsql;

-- GET AUXILIAR BY NAME
CREATE OR REPLACE FUNCTION get_situation_by_name(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'situation';
BEGIN
	OPEN result FOR
	SELECT id FROM model WHERE name = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_paymethod_by_name(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'paymethod';
BEGIN
	OPEN result FOR
	SELECT id FROM pay_method WHERE name = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_brand_by_name(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'brand';
BEGIN
	OPEN result FOR
	SELECT id FROM brand WHERE name = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_country_by_name(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'country';
BEGIN
	OPEN result FOR
	SELECT id FROM country WHERE name = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_category_by_name(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'category';
BEGIN
	OPEN result FOR
	SELECT id FROM category WHERE name = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_model_by_name(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'model';
BEGIN
	OPEN result FOR
	SELECT id, brand_id FROM model WHERE name = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

-- GET ALL MAIN
CREATE OR REPLACE FUNCTION get_tourists() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'tourists';
BEGIN
	OPEN result FOR
	SELECT * FROM tourist;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_drivers() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'drivers';
BEGIN
	OPEN result FOR
	SELECT * FROM driver;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_cars() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'cars';
BEGIN
	OPEN result FOR
	SELECT * FROM car;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_contracts() RETURNS refcursor AS $$
DECLARE
	result refcursor := 'contract';
BEGIN
	OPEN result FOR
	SELECT * FROM contract;
	RETURN result;
END; $$
LANGUAGE plpgsql;

-- GET MAIN BY KEY
CREATE OR REPLACE FUNCTION get_car_by_plate(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'car';
BEGIN
	OPEN result FOR
	SELECT * FROM car WHERE plate = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_driver_by_dni(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'driver';
BEGIN
	OPEN result FOR
	SELECT * FROM driver WHERE dni = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_tourist_by_passport(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'tourist';
BEGIN
	OPEN result FOR
	SELECT * FROM tourist WHERE passport = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_contract_by_passport(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'contract';
BEGIN
	OPEN result FOR
	SELECT * FROM contract WHERE tourist_passport = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_contract_by_plate(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'contract';
BEGIN
	OPEN result FOR
	SELECT * FROM contract WHERE car_plate = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_contract_by_dni(varchar) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'contract';
BEGIN
	OPEN result FOR
	SELECT * FROM contract WHERE driver_dni = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_contract_by_id(integer) RETURNS refcursor AS $$
DECLARE
	result refcursor := 'contract';
BEGIN
	OPEN result FOR
	SELECT * FROM contract WHERE id = $1;
	RETURN result;
END; $$
LANGUAGE plpgsql;