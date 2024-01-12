USE [Codecademy]
GO
SET IDENTITY_INSERT [dbo].[Cursus] ON 

INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (1, N'Programmeren in Java', N'Java, Spring', N'Leer Java!', N'Beginner')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (2, N'Databases', N'SQL', N'Leer alles over queries in SQL!', N'Beginner')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (3, N'Web Development', N'HTML, CSS, JS', N'Leer het maken van websites!', N'Beginner')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (4, N'Web Framework', N'Django', N'Leer frontend en backend!', N'Gevorderd')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (5, N'ABCs voor C++', N'C++', N'Leer te coderen in C++', N'Beginner')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (6, N'Python voor beginners', N'Python', N'Python is een uitstekende taal om te leren voor beginnende programmeurs.', N'Beginner')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (7, N'Python voor gevorderden', N'Python', N'Leer python door en door met deze cursus', N'Gevorderd')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (8, N'C# voor beginners', N'C#', N'Leer te coderen in een van de meest gebruikte codetalen ter wereld', N'Beginner')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (9, N'C# en Unity crashcourse', N'Unity', N'Leer de Unity engine te gebruiken in C#', N'Expert')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (10, N'C# voor gevorderden', N'C#', N'Leer lastige C# programmataal met deze cursus', N'Gevorderd')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (11, N'ABCs voor C#', N'C#', N'Leer te coderen in C#', N'Testen')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (12, N'Ontwerp een game in C++', N'C++', N'Leer games te coderen met C++', N'Expert')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (13, N'Hoe style je een website', N'HTML, CSS', N'Makkelijke cursus om te leren hoe je een website style geeft', N'Beginner')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (14, N'Java en SQL', N'SQL, Java', N'Leer hoe je een database aan je Java programma koppelt', N'Expert')
INSERT [dbo].[Cursus] ([ID], [CursusNaam], [Onderwerp], [IntroductieTekst], [NiveauAanduiding]) VALUES (15, N'JavaFX crashcourse', N'JavaFX', N'Leer een GUI te maken met behulp van JavaFX in Java', N'Gevorderd')

SET IDENTITY_INSERT [dbo].[Cursus] OFF
GO
SET IDENTITY_INSERT [dbo].[Cursist] ON 

INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'johan@hotmail.com', N'Jan Peeters', CAST(N'2001-07-28' AS Date), N'Man', N'12', N'2947 GD', N'Kerkstraat', N'Rotterdam', N'Nederland', 1)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'piet@hotmail.com', N'Piet Versteeg', CAST(N'1999-03-29' AS Date), N'Man', N'37', N'5721 DA', N'Plantage Kerklaan', N'Amsterdam', N'Nederland', 2)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'kees@gmail.com', N'Kees van Dongen', CAST(N'2001-05-21' AS Date), N'Man', N'92', N'3628 MI', N'Dorpsstraat', N'Ridderkerk', N'Nederland', 3)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'gerda@pm.me', N'Gerda Klaassen', CAST(N'1954-09-02' AS Date), N'Vrouw', N'14', N'2486 PW', N'Thorbeckestraat ', N'Hendrik-Ido-Ambacht', N'Nederland', 4)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'borina@icloud.com', N'Borina van Erven', CAST(N'1998-02-13' AS Date), N'Anders', N'172', N'3492 PC', N'Rotterdamseweg 21', N'Ridderkerk', N'Nederland', 5)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'jp12@pm.me', N'Jan Griffen', CAST(N'2003-12-04' AS Date), N'Man', N'1', N'8420 EC', N'Dorpsweg', N'Hoofddorp', N'Nederland', 11)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'john.doe@gmail.com', N'John Doe', CAST(N'1980-01-01' AS Date), N'Man', N'1', N'1234 AB   ', N'Hoofdweg', N'Amsterdam', N'Nederland', 12)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'jane.doe@outlook.com', N'Jane Doe', CAST(N'1985-06-20' AS Date), N'Vrouw', N'23', N'5678 CD   ', N'Hoofdweg', N'Rotterdam', N'Nederland', 13)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'jack.smith@icloud.com', N'Jack Smith', CAST(N'1990-03-03' AS Date), N'Man', N'45', N'9101 EF   ', N'Oudelandseweg', N'Utrecht', N'Nederland', 14)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'al.johnson@gmail.com', N'Al Johnson', CAST(N'1995-09-07' AS Date), N'Anders', N'67', N'1234 AB   ', N'Patersweg', N'Amsterdam', N'Nederland', 15)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'bob.johnson@icloud.com', N'Bob Johnson', CAST(N'1997-02-14' AS Date), N'Man', N'89', N'5678 CD   ', N'Hoofdstraat', N'Rotterdam', N'Nederland', 16)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'chris.jackson@gmail.com', N'Chris Jackson', CAST(N'1999-05-29' AS Date), N'Anders', N'10', N'3314 EF   ', N'Krispijnseweg', N'Dordrecht', N'Nederland', 17)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'evgerwen@hotmail.com', N'Erwin van Gerwen', CAST(N'1975-05-03' AS Date), N'Man', N'160A', N'4269 GG   ', N'Hoofdstraat', N'Utrecht', N'Nederland', 18)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'vergil2004@gmail.com', N'Vergil van de Heijden', CAST(N'2004-10-13' AS Date), N'Man', N'1B', N'3389 FY   ', N'Van Goghstraat', N'Amsterdam', N'Nederland', 19)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'dantevv@outlook.com', N'Dante Vermeulen', CAST(N'2001-05-09' AS Date), N'Anders', N'10', N'9812 EZ   ', N'Pepermolen', N'Volendam', N'Nederland', 20)
INSERT [dbo].[Cursist] ([EmailAdres], [Naam], [GeboorteDatum], [Geslacht], [Huisnummer], [Postcode], [Straat], [Woonplaats], [Land], [ID]) VALUES (N'ilse.kok@outlook.com', N'Ilse Kok', CAST(N'1979-01-03' AS Date), N'Vrouw', N'67B', N'3452 WE   ', N'Lange Eendstraat', N'Utrecht', N'Nederland', 21)




SET IDENTITY_INSERT [dbo].[Cursist] OFF
GO
SET IDENTITY_INSERT [dbo].[Inschrijving] ON 

INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (1, 1, CAST(N'2023-04-01' AS Date), 1)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (1, 3, CAST(N'2023-04-01' AS Date), 2)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (1, 4, CAST(N'2023-01-09' AS Date), 35)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (1, 11, CAST(N'2022-06-01' AS Date), 33)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (2, 1, CAST(N'2023-04-01' AS Date), 11)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (2, 2, CAST(N'2023-04-01' AS Date), 12)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (2, 3, CAST(N'2023-04-01' AS Date), 13)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (3, 1, CAST(N'2023-06-01' AS Date), 34)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (3, 5, CAST(N'2023-04-01' AS Date), 18)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (3, 11, CAST(N'2023-04-01' AS Date), 20)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (3, 15, CAST(N'2023-04-01' AS Date), 17)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (4, 18, CAST(N'2023-04-01' AS Date), 16)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (10, 17, CAST(N'2023-01-01' AS Date), 1034)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (7, 20, CAST(N'2020-04-08' AS Date), 160)
INSERT [dbo].[Inschrijving] ([CursusID], [CursistID], [Datum], [ID]) VALUES (6, 21, CAST(N'2013-12-11' AS Date), 10)

SET IDENTITY_INSERT [dbo].[Inschrijving] OFF
GO
SET IDENTITY_INSERT [dbo].[ContentItem] ON 

INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (1, CAST(N'2023-05-01' AS Date), N'Actief', 4)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (2, CAST(N'2022-12-01' AS Date), N'Actief', 5)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (3, CAST(N'2021-12-04' AS Date), N'Actief', 6)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (4, CAST(N'2022-05-01' AS Date), N'Actief', 7)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (5, CAST(N'2022-06-03' AS Date), N'Actief', 8)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (6, CAST(N'2020-12-01' AS Date), N'Actief', 9)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (7, CAST(N'2012-11-01' AS Date), N'Actief', 10)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (8, CAST(N'2011-05-03' AS Date), N'Actief', 11)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (9, CAST(N'2013-06-01' AS Date), N'Actief', 12)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (10, CAST(N'2014-06-02' AS Date), N'Actief', 13)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (11, CAST(N'2015-06-03' AS Date), N'Actief', 14)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (12, CAST(N'2015-06-03' AS Date), N'Actief', 15)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (13, CAST(N'2015-06-03' AS Date), N'Actief', 16)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (14, CAST(N'2015-06-03' AS Date), N'Actief', 17)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (15, CAST(N'2015-06-03' AS Date), N'Actief', 18)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (16, CAST(N'2015-06-03' AS Date), N'Actief', 19)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (17, CAST(N'2015-06-03' AS Date), N'Actief', 20)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (18, CAST(N'2015-06-03' AS Date), NULL, 21)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (19, CAST(N'2020-11-13' AS Date), N'Actief', 22)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (20, CAST(N'2019-09-25' AS Date), NULL, 23)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (21, CAST(N'2016-12-03' AS Date), NULL, 24)
INSERT [dbo].[ContentItem] ([ContentItemNummer], [PublicatieDatum], [Status], [ID]) VALUES (22, CAST(N'2023-01-03' AS Date), N'Actief', 25)
SET IDENTITY_INSERT [dbo].[ContentItem] OFF
GO
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Java 1', 1, N'Java introductie', 4, 1, 1, 4)
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Java 2', 1, N'Tweede Java les', 4, 2, 1, 5)
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Java 3', 1, N'Derde Java les',  4, 3, 1, 6)
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Web Basis', 1, N'Installeer Visual Studio', 3, 4, 3, 7)
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Je eerste website', 1, N'In deze module bouw je je eerste website', 3, 5, 3, 8)
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Data 1', 1, N'Installeer Microsoft SQL Server Management Studio', 1, 6, 2, 9)
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Web Gevorderd', 1, N'Leer hoe je videos kan afspelen op je website', 2, 7, 3, 15)
INSERT [dbo].[Module] ([Titel], [Versie], [Beschrijving], [Contactpersoon], [Volgnummer], [CursusID], [ContentItemID]) VALUES (N'Data 2', 1, N'Voer je eerste query uit in SQL', 1, 8, 2, 16)
GO
INSERT [dbo].[Contactpersoon] ([ContactPersoonID],[Naam],[Email]) VALUES( 1 ,N'Jan Voorthuizen', N'j.voorthuizen@codecademy.com')
INSERT [dbo].[Contactpersoon] ([ContactPersoonID],[Naam],[Email]) VALUES( 2 ,N'Erna Meulhuis', N'e.meulhuis@codecademy.com')
INSERT [dbo].[Contactpersoon] ([ContactPersoonID],[Naam],[Email]) VALUES( 3 ,N'Dorien Meijer', N'd.meijer@codecademy.com')
INSERT [dbo].[Contactpersoon] ([ContactPersoonID],[Naam],[Email]) VALUES( 4 ,N'Henk van der Linden', N'h.vanderlinden@codecademy.com')
INSERT [dbo].[Contactpersoon] ([ContactPersoonID],[Naam],[Email]) VALUES( 1 ,N'Jan Voorthuizen', N'j.voorthuizen@codecademy.com')
INSERT [dbo].[Contactpersoon] ([ContactPersoonID],[Naam],[Email]) VALUES( 1 ,N'Jan Voorthuizen', N'j.voorthuizen@codecademy.com')
INSERT [dbo].[Contactpersoon] ([ContactPersoonID],[Naam],[Email]) VALUES( 1 ,N'Jan Voorthuizen', N'j.voorthuizen@codecademy.com')
GO
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (1, 2)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (2, 1)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (3, 1)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (3, 2)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (1, 15)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (13, 1)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (1, 13)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (15, 1)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (13, 6)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (13, 5)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (5, 13)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (13, 14)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (14, 13)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (13, 2)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (2, 13)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (8, 9)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (8, 10)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (10, 8)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (9, 8)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (8, 11)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (11, 8)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (11, 14)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (7, 6)
INSERT [dbo].[Aanbevolen] ([AanbevolenID], [AanbevolenBijId]) VALUES (6, 7)

GO
SET IDENTITY_INSERT [dbo].[Bekijkt] ON 

INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 19, 100, 1, 4)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 20, 100, 1, 5)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 21, 100, 1, 6)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 22, 100, 3, 4)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 23, 12, 3, 5)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 24, 100, 1, 7)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 25, 100, 1, 8)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 26, 100, 1, 15)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 27, 12, 2, 7)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 28, 100, 3, 7)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 29, 100, 3, 8)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 30, 100, 3, 15)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 33, 0, 3, 6)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 34, 15, 2, 8)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 36, 0, 2, 15)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 39, 10, 5, 9)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 40, 60, 5, 16)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 41, 100, 11, 9)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 42, 100, 11, 16)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 43, 80, 15, 9)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 45, 0, 15, 16)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 46, 100, 17, 9)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2023-04-01' AS Date), 47, 100, 17, 16)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2022-06-01' AS Date), 76, 0, 11, 7)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2022-06-01' AS Date), 77, 0, 11, 8)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2022-06-01' AS Date), 78, 0, 11, 15)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2022-09-01' AS Date), 79, 0, 1, 9)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2021-12-01' AS Date), 82, 100, 1, 10)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2021-12-01' AS Date), 83, 80, 2, 10)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2021-12-01' AS Date), 84, 50, 3, 10)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2021-12-01' AS Date), 85, 30, 1, 11)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2021-12-01' AS Date), 86, 60, 2, 11)
INSERT [dbo].[Bekijkt] ([Datum], [ID], [Voortgang], [CursistID], [ContentItemID]) VALUES (CAST(N'2021-12-01' AS Date), 87, 87, 1, 12)
SET IDENTITY_INSERT [dbo].[Bekijkt] OFF
GO
SET IDENTITY_INSERT [dbo].[Certificaat] ON 

INSERT [dbo].[Certificaat] ([ID], [Cijfer], [NaamMedewerker], [CertificaatNummer], [InschrijvingID]) VALUES (1, 8, N'Dorien Meijer', 1, 1)
INSERT [dbo].[Certificaat] ([ID], [Cijfer], [NaamMedewerker], [CertificaatNummer], [InschrijvingID]) VALUES (2, 9, N'Jan Voorthuizen', 2, 11)
INSERT [dbo].[Certificaat] ([ID], [Cijfer], [NaamMedewerker], [CertificaatNummer], [InschrijvingID]) VALUES (3, 7, N'Henk van der Linden', 3, 13)
INSERT [dbo].[Certificaat] ([ID], [Cijfer], [NaamMedewerker], [CertificaatNummer], [InschrijvingID]) VALUES (4, 6, N'Erna Meulhuis', 4, 20)
INSERT [dbo].[Certificaat] ([ID], [Cijfer], [NaamMedewerker], [CertificaatNummer], [InschrijvingID]) VALUES (5, 6, N'Jan Voorthuizen', 5, 16)
SET IDENTITY_INSERT [dbo].[Certificaat] OFF
GO
INSERT [dbo].[Webcast] ([ContentItemID], [Titel], [Beschrijving], [Spreker], [Tijdsduur], [URL]) VALUES (10, N'Data 1', N'Data 1', 1, CAST(N'00:13:51' AS Time), N'test')
INSERT [dbo].[Webcast] ([ContentItemID], [Titel], [Beschrijving], [Spreker], [Tijdsduur], [URL]) VALUES (11, N'Data 2', N'Data 2', 2, CAST(N'00:20:31' AS Time), N'test')
INSERT [dbo].[Webcast] ([ContentItemID], [Titel], [Beschrijving], [Spreker], [Tijdsduur], [URL]) VALUES (12, N'Programmeren', N'Programmeren', 3, CAST(N'00:23:21' AS Time), N'test')
INSERT [dbo].[Webcast] ([ContentItemID], [Titel], [Beschrijving], [Spreker], [Tijdsduur], [URL]) VALUES (13, N'Programmeren 2', N'Programmeren 2',4, CAST(N'01:20:01' AS Time), N'test')
INSERT [dbo].[Webcast] ([ContentItemID], [Titel], [Beschrijving], [Spreker], [Tijdsduur], [URL]) VALUES (14, N'Game Development', N'Game Development', 2, CAST(N'01:01:01' AS Time), N'test')
GO
INSERT [dbo].[Spreker] ([SprekerID], [NaamSpreker], [Organisatie]) VALUES (1, N'J. Doe', N'jdoe@acme.com')
INSERT [dbo].[Spreker] ([SprekerID], [NaamSpreker], [Organisatie]) VALUES (2, N'J. Smith', N'jsmith@example.com')
INSERT [dbo].[Spreker] ([SprekerID], [NaamSpreker], [Organisatie]) VALUES (3, N'C. Williams', N'chris@oracle.com')
INSERT [dbo].[Spreker] ([SprekerID], [NaamSpreker], [Organisatie]) VALUES (4,  N'C. Johnson', N'info@cjohn.com')
GO
