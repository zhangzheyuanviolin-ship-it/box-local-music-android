            package p000;
            
            public final class iOII0IlOl extends iOIoOiOo {
                public static final iOIoOiOo I0000oI00;

                static {
/* 10 */            iOII0IlOl ioii0ilol = new iOII0IlOl(null, new Ol0Ii10o1(0));
/* 17 */            if (ioii0ilol.I0000Il00O) {
/* 74 */                I000II.I001IO000("Already frozen");
/* 110 */               return;
                    }
/* 20 */            ioii0ilol.I0000Il00O = true;
/* 22 */            I0000oI00 = ioii0ilol;
/* 28 */            Ol0Ii10o1 ol0Ii10o1 = new Ol0Ii10o1(0);
/* 31 */            iOII0IlOl ioii0ilol2 = new iOII0IlOl(ioii0ilol, ol0Ii10o1);
/* 34 */            boolean z = ioii0ilol2.I0000Il00O;
/* 36 */            Boolean bool = Boolean.TRUE;
/* 38 */            if (z) {
/* 70 */                I000II.I001IO000("Can't mutate after handing to trace");
/* 73 */                return;
                    }
/* 44 */            if (ioii0ilol2.I00000oIO()) {
/* 64 */                I000II.I001IO000("Key already present");
/* 67 */                return;
                    }
/* 48 */            ol0Ii10o1.put(iOIoOiOo.I0000O, bool);
/* 53 */            if (ioii0ilol2.I0000Il00O) {
/* 58 */                I000II.I001IO000("Already frozen");
                    } else {
/* 55 */                ioii0ilol2.I0000Il00O = true;
                    }
                }
            }
