-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-11-30 12:58:33.842

-- tables
-- Table: audio
CREATE TABLE audio
(
    id        serial       NOT NULL,
    user_id  int          NOT NULL,
    title     varchar(255) NOT NULL,
    audio     bytea        NOT NULL,
    timestamp timestamp    NOT NULL,
    CONSTRAINT audio_pk PRIMARY KEY (id)
);

-- Table: bucketlist
CREATE TABLE bucketlist
(
    id        serial       NOT NULL,
    user_id   int          NOT NULL,
    title     varchar(255) NOT NULL,
    text      bytea        NOT NULL,
    timestamp timestamp    NOT NULL,
    CONSTRAINT bucketlist_pk PRIMARY KEY (id)
);

-- Table: funeral_wish
CREATE TABLE funeral_wish
(
    id         serial NOT NULL,
    funeral_id int    NOT NULL,
    wish_id    int    NOT NULL,
    CONSTRAINT funeral_wish_pk PRIMARY KEY (id)
);

-- Table: funeral

CREATE TABLE funeral
(
    id                   serial NOT NULL,
    funeral_instructions text   NOT NULL,
    testament            text   NOT NULL,
    menüü                text   NOT NULL,
    hauaplats            text   NOT NULL,
    matusetüüp           text   NOT NULL,
    skulptuur            text   NOT NULL,
    user_id              int    NOT NULL,
    CONSTRAINT funeral_pk PRIMARY KEY (id)
);

-- Table: image
CREATE TABLE image
(
    id        serial       NOT NULL,
    user_id   int          NOT NULL,
    title     varchar(255) NOT NULL,
    file      bytea        NOT NULL,
    timestamp timestamp    NOT NULL,
    status   char(1)      NOT NULL,
    CONSTRAINT image_pk PRIMARY KEY (id)
);

-- Table: location
CREATE TABLE location
(
    id          serial        NOT NULL,
    user_id     int           NOT NULL,
    title       varchar(255)  NOT NULL,
    timestamp   timestamp     NOT NULL,
    latitude    decimal(8, 6) NULL,
    longtitude  decimal(8, 6) NULL,
    description varchar(1000) NOT NULL,
    CONSTRAINT location_pk PRIMARY KEY (id)
);

-- Table: memory
CREATE TABLE memory
(
    id        serial       NOT NULL,
    user_id  int          NOT NULL,
    title     varchar(255) NOT NULL,
    text      bytea        NOT NULL,
    timestamp timestamp    NOT NULL,
    CONSTRAINT memory_pk PRIMARY KEY (id)
);

-- Table: profile
CREATE TABLE profile
(
    id      serial       NOT NULL,
    user_id int          NOT NULL,
    email   varchar(255) NOT NULL,
    avatar  bytea        NOT NULL,
    CONSTRAINT profile_pk PRIMARY KEY (id)
);

-- Table: relationship
CREATE TABLE relationship
(
    id        serial NOT NULL,
    user_id   int    NOT NULL,
    friend_id int    NOT NULL,
    CONSTRAINT relationship_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role
(
    id   serial      NOT NULL,
    name varchar(50) NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user"
(
    id       serial       NOT NULL,
    role_id  int          NOT NULL,
    email    varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    status   char(1)      NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- Table: video
CREATE TABLE video
(
    id        serial       NOT NULL,
    user_id  int          NOT NULL,
    title     varchar(255) NOT NULL,
    file      bytea        NOT NULL,
    timestamp timestamp    NOT NULL,
    CONSTRAINT video_pk PRIMARY KEY (id)
);

-- Table: wish
CREATE TABLE wish
(
    id   serial       NOT NULL,
    name varchar(255) NOT NULL,
    CONSTRAINT wish_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: audio_user (table: audio)
ALTER TABLE audio
    ADD CONSTRAINT audio_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: bucketlist_user (table: bucketlist)
ALTER TABLE bucketlist
    ADD CONSTRAINT bucketlist_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: funeral_wish_funeral (table: funeral_wish)
ALTER TABLE funeral_wish
    ADD CONSTRAINT funeral_wish_funeral
        FOREIGN KEY (funeral_id)
            REFERENCES funeral (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: funeral_wish_wish (table: funeral_wish)
ALTER TABLE funeral_wish
    ADD CONSTRAINT funeral_wish_wish
        FOREIGN KEY (wish_id)
            REFERENCES wish (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: funeral_user (table: funeral)
ALTER TABLE funeral
    ADD CONSTRAINT funeral_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: location_user (table: location)
ALTER TABLE location
    ADD CONSTRAINT location_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: photo_user (table: image)
ALTER TABLE image
    ADD CONSTRAINT photo_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: profile_user (table: profile)
ALTER TABLE profile
    ADD CONSTRAINT profile_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: relationship_friend (table: relationship)
ALTER TABLE relationship
    ADD CONSTRAINT relationship_friend
        FOREIGN KEY (friend_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: relationship_user (table: relationship)
ALTER TABLE relationship
    ADD CONSTRAINT relationship_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: text_user (table: memory)
ALTER TABLE memory
    ADD CONSTRAINT text_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user"
    ADD CONSTRAINT user_role
        FOREIGN KEY (role_id)
            REFERENCES role (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: video_user (table: video)
ALTER TABLE video
    ADD CONSTRAINT video_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- End of file.

