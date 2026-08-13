            package p000;
            
            public abstract class ii0OOl implements Cloneable {
                public final ii0OoOo10 I00iOIl;
                public ii0OoOo10 I00iiI;

                public ii0OOl(ii0OoOo10 ii0oooo10) {
/* 4 */             this.I00iOIl = ii0oooo10;
/* 10 */            if (ii0oooo10.I00100l0()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = ii0oooo10.I000II();
                }

                public static void I00000oIO(Object obj, Object obj2) {
/* 11 */            ii0oIOiIl.I0000Il00O.I00000oIO(obj.getClass()).I00000oOI(obj, obj2);
                }

                public final void I00000oOI(ii0OoOo10 ii0oooo10) {
/* 7 */             if (this.I00iOIl.equals(ii0oooo10)) {
/* 29 */                return;
                    }
/* 15 */            if (!this.I00iiI.I00100l0()) {
/* 17 */                I000II();
                    }
/* 22 */            I00000oIO(this.I00iiI, ii0oooo10);
                }

                public final ii0OoOo10 I0000Il00O() {
/* 1 */             ii0OoOo10 ii0oooo10I0000O = I0000O();
/* 10 */            if (ii0OoOo10.I000oI1ioi(ii0oooo10I0000O, true)) {
/* 12 */                return ii0oooo10I0000O;
                    }
/* 20 */            throw new ii10Il0l();
                }

                public ii0OoOo10 I0000O() {
/* 3 */             boolean zI00100l0 = this.I00iiI.I00100l0();
/* 7 */             ii0OoOo10 ii0oooo10 = this.I00iiI;
/* 9 */             if (!zI00100l0) {
/* 11 */                return ii0oooo10;
                    }
/* 12 */            ii0oooo10.I000iOII();
/* 15 */            return this.I00iiI;
                }

                public ii00oo I0000oI00() {
/* 1 */             return I0000O();
                }

                public final void I0001Ioi1lo() {
/* 7 */             if (this.I00iiI.I00100l0()) {
/* 20 */                return;
                    }
/* 9 */             I000II();
                }

                public void I000II() {
/* 3 */             ii0OoOo10 ii0oooo10I000II = this.I00iOIl.I000II();
/* 9 */             I00000oIO(ii0oooo10I000II, this.I00iiI);
/* 12 */            this.I00iiI = ii0oooo10I000II;
                }

                public final Object clone() {
/* 9 */             ii0OOl ii0ool = (ii0OOl) this.I00iOIl.I0010I0i(5, null);
/* 15 */            ii0ool.I00iiI = I0000O();
/* 20 */            return ii0ool;
                }
            }
