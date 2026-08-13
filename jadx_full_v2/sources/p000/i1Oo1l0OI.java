            package p000;
            
            public final class i1Oo1l0OI implements Cloneable {
                public final i1ii0i I00iOIl;
                public i1ii0i I00iiI;

                public i1Oo1l0OI(i1ii0i i1ii0iVar) {
/* 4 */             this.I00iOIl = i1ii0iVar;
/* 10 */            if (i1ii0iVar.I000O01llI0()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = i1ii0iVar.I0000Il00O();
                }

                public final i1ii0i I00000oIO() {
/* 3 */             boolean zI000O01llI0 = this.I00iiI.I000O01llI0();
/* 7 */             i1ii0i i1ii0iVar = this.I00iiI;
/* 9 */             if (!zI000O01llI0) {
/* 11 */                return i1ii0iVar;
                    }
/* 12 */            i1ii0iVar.getClass();
/* 25 */            i1o0Ol1I1oI1.I0000Il00O.I00000oIO(i1ii0iVar.getClass()).zze(i1ii0iVar);
/* 28 */            i1ii0iVar.I0000oI00();
/* 31 */            return this.I00iiI;
                }

                public final Object clone() {
/* 8 */             i1Oo1l0OI i1oo1l0oi = (i1Oo1l0OI) this.I00iOIl.I00000oIO(5);
/* 14 */            i1oo1l0oi.I00iiI = I00000oIO();
/* 20 */            return i1oo1l0oi;
                }
            }
