-- Kustutab kaob schema (mis põhimõtteliselt kustutab kõik tabelid)
DROP SCHEMA kaob CASCADE;
-- Loob uue kaob schema vajalikud õigused
CREATE SCHEMA kaob
-- taastab vajalikud andmebaasi õigused
    GRANT ALL ON SCHEMA kaob TO postgres;
GRANT ALL ON SCHEMA kaob TO public;