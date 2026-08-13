            package p000;

            import java.util.HashSet;
            
            public final class IOiIOOl0lO {
                public String I00000oIO = null;
                public HashSet I00000oOI;
                public HashSet I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public IOiOiIIiii1 I0001Ioi1lo;
                public HashSet I000II;

                public IOiIOOl0lO(Class cls, Class... clsArr) {
/* 9 */             HashSet hashSet = new HashSet();
/* 12 */            this.I00000oOI = hashSet;
/* 19 */            this.I0000Il00O = new HashSet();
/* 22 */            this.I0000O = 0;
/* 24 */            this.I0000oI00 = 0;
/* 31 */            this.I000II = new HashSet();
/* 37 */            hashSet.add(OOiilOlOOI.I00000oIO(cls));
/* 41 */            for (Class cls2 : clsArr) {
/* 47 */                lII0IlO.I00000oIO("Null interface", cls2);
/* 56 */                this.I00000oOI.add(OOiilOlOOI.I00000oIO(cls2));
                    }
                }

                public final void I00000oIO(IiIooooiilo iiIooooiilo) {
/* 9 */             if (this.I00000oOI.contains(iiIooooiilo.I00000oIO)) {
/* 19 */                I000II.I000iOII("Components are not allowed to depend on interfaces they themselves provide.");
                    } else {
/* 13 */                this.I0000Il00O.add(iiIooooiilo);
                    }
                }

                public final IOiIi0Oi I00000oOI() {
/* 8 */             if (this.I0001Ioi1lo != null) {
/* 36 */                return new IOiIi0Oi(this.I00000oIO, new HashSet(this.I00000oOI), new HashSet(this.I0000Il00O), this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II);
                    }
/* 42 */            I000II.I001IO000("Missing required property: factory.");
/* 45 */            return null;
                }
            }
