            package p000;
            
            public abstract class o0OOOlI {
                public static final o0OIIli0Oi0 I0000O = new o0OIIli0Oi0();
                public final o0OOOlI I00000oIO;
                public final Ol0Ii10o1 I00000oOI;
                public boolean I0000Il00O = false;

                public o0OOOlI(o0OOOlI o0oooli, Ol0Ii10o1 ol0Ii10o1) {
/* 7 */             if (o0oooli != null) {
/* 11 */                lII0I0I01I1l.I00000oOI(o0oooli.I0000Il00O);
                    }
/* 14 */            this.I00000oIO = o0oooli;
/* 16 */            this.I00000oOI = ol0Ii10o1;
                }

                public static o0OOOlI I00000oIO(o0OOOlI o0oooli, o0OOOlI o0oooli2) {
/* 1 */             o0oooli.getClass();
/* 4 */             o0OOOlI o0oooli3 = o0OIlOoolo.I0000oI00;
/* 6 */             if (o0oooli == o0oooli3) {
/* 8 */                 return o0oooli2;
                    }
/* 9 */             o0oooli2.getClass();
/* 12 */            if (o0oooli2 == o0oooli3) {
/* 14 */                return o0oooli;
                    }
/* 20 */            Ioio0O<o0OOOlI> ioio0OI000o00OoI0I = Ioio0O.I000o00OoI0I(2, o0oooli, o0oooli2);
/* 28 */            if (ioio0OI000o00OoI0I.isEmpty()) {
/* 30 */                return o0oooli3;
                    }
/* 36 */            if (ioio0OI000o00OoI0I.size() == 1) {
/* 46 */                return (o0OOOlI) ioio0OI000o00OoI0I.iterator().next();
                    }
/* 54 */            int i = 0;
/* 59 */            for (o0OOOlI o0oooli4 : ioio0OI000o00OoI0I) {
/* 74 */                do {
/* 71 */                    i += o0oooli4.I00000oOI.I00iiO;
/* 72 */                    o0oooli4 = o0oooli4.I00000oIO;
/* 74 */                } while (o0oooli4 != null);
                    }
/* 77 */            if (i == 0) {
/* 79 */                return o0OIlOoolo.I0000oI00;
                    }
/* 84 */            Ol0Ii10o1 ol0Ii10o1 = new Ol0Ii10o1(i);
/* 95 */            for (o0OOOlI o0oooli5 : ioio0OI000o00OoI0I) {
/* 143 */               do {
/* 103 */                   int i2 = 0;
                            while (true) {
/* 104 */                       Ol0Ii10o1 ol0Ii10o12 = o0oooli5.I00000oOI;
/* 108 */                       if (i2 >= ol0Ii10o12.I00iiO) {
                                    break;
                                }
/* 135 */                       lII0I0I01I1l.I0000Il00O(ol0Ii10o1.put((o0OIIli0Oi0) ol0Ii10o12.I000II(i2), ol0Ii10o12.I000OiO(i2)) == null, "Duplicate bindings: %s", ol0Ii10o12.I000II(i2));
/* 138 */                       i2++;
                            }
/* 141 */                   o0oooli5 = o0oooli5.I00000oIO;
/* 143 */               } while (o0oooli5 != null);
                    }
/* 152 */           return new o0OIlOoolo(null, ol0Ii10o1).I00000oOI();
                }

                public final o0OOOlI I00000oOI() {
/* 3 */             if (this.I0000Il00O) {
/* 24 */                I000II.I001IO000("Already frozen");
/* 27 */                return null;
                    }
/* 6 */             this.I0000Il00O = true;
/* 8 */             o0OOOlI o0oooli = this.I00000oIO;
                    return (o0oooli == null || !this.I00000oOI.isEmpty()) ? this : o0oooli;
                }

                public final boolean I0000Il00O() {
/* 9 */             if (this.I00000oOI.containsKey(I0000O)) {
/* 24 */                return true;
                    }
/* 11 */            o0OOOlI o0oooli = this.I00000oIO;
                    return o0oooli != null && o0oooli.I0000Il00O();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SpanExtras<");
/* 9 */             for (o0OOOlI o0oooli = this; o0oooli != null; o0oooli = o0oooli.I00000oIO) {
/* 16 */                for (int i = 0; i < o0oooli.I00000oOI.I00iiO; i++) {
/* 20 */                    sb.append("[");
/* 29 */                    sb.append(this.I00000oOI.I000OiO(i));
/* 34 */                    sb.append("], ");
                        }
                    }
/* 45 */            sb.append(">");
/* 48 */            return sb.toString();
                }
            }
