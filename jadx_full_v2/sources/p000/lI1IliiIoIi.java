            package p000;
            
            public abstract class lI1IliiIoIi implements Cloneable {
                public final lIIOO0oi1o I00iOIl;
                public lIIOO0oi1o I00iiI;

                public lI1IliiIoIi(lIIOO0oi1o liioo0oi1o) {
/* 4 */             this.I00iOIl = liioo0oi1o;
/* 11 */            if (liioo0oi1o.I000O01llI0()) {
/* 25 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 20 */            this.I00iiI = (lIIOO0oi1o) liioo0oi1o.I000OiO(4, null);
                }

                public static void I00000oIO(Object obj, Object obj2) {
/* 11 */            lO1Ilo0lloiO.I0000Il00O.I00000oIO(obj.getClass()).I00000oOI(obj, obj2);
                }

                public final lIIOO0oi1o I00000oOI() {
/* 1 */             lIIOO0oi1o liioo0oi1oI0000Il00O = I0000Il00O();
/* 10 */            if (lIIOO0oi1o.I000II(liioo0oi1oI0000Il00O, true)) {
/* 12 */                return liioo0oi1oI0000Il00O;
                    }
/* 20 */            throw new lOOOIoiiilo();
                }

                public lIIOO0oi1o I0000Il00O() {
/* 3 */             boolean zI000O01llI0 = this.I00iiI.I000O01llI0();
/* 7 */             lIIOO0oi1o liioo0oi1o = this.I00iiI;
/* 9 */             if (!zI000O01llI0) {
/* 11 */                return liioo0oi1o;
                    }
/* 12 */            liioo0oi1o.getClass();
/* 25 */            lO1Ilo0lloiO.I0000Il00O.I00000oIO(liioo0oi1o.getClass()).I00000oIO(liioo0oi1o);
/* 28 */            liioo0oi1o.I0000O();
/* 31 */            return this.I00iiI;
                }

                public lIoolOoilO I0000O() {
/* 1 */             return I0000Il00O();
                }

                public final void I0000oI00() {
/* 7 */             if (this.I00iiI.I000O01llI0()) {
/* 20 */                return;
                    }
/* 9 */             I0001Ioi1lo();
                }

                public void I0001Ioi1lo() {
/* 9 */             lIIOO0oi1o liioo0oi1o = (lIIOO0oi1o) this.I00iOIl.I000OiO(4, null);
/* 13 */            I00000oIO(liioo0oi1o, this.I00iiI);
/* 16 */            this.I00iiI = liioo0oi1o;
                }

                public final Object clone() {
/* 9 */             lI1IliiIoIi li1iliiioii = (lI1IliiIoIi) this.I00iOIl.I000OiO(5, null);
/* 15 */            li1iliiioii.I00iiI = I0000Il00O();
/* 20 */            return li1iliiioii;
                }
            }
