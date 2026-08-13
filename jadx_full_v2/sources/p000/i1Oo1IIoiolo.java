            package p000;
            
            public final class i1Oo1IIoiolo implements Cloneable {
                public final i1ii0Io I00iOIl;
                public i1ii0Io I00iiI;

                public i1Oo1IIoiolo(i1ii0Io i1ii0io) {
/* 4 */             this.I00iOIl = i1ii0io;
/* 10 */            if (i1ii0io.I000O01llI0()) {
/* 21 */                I000II.I000iOII("Default instance must be immutable.");
/* 29 */                throw null;
                    }
/* 16 */            this.I00iiI = i1ii0io.I0000Il00O();
                }

                public final i1ii0Io I00000oIO() {
/* 3 */             boolean zI000O01llI0 = this.I00iiI.I000O01llI0();
/* 7 */             i1ii0Io i1ii0io = this.I00iiI;
/* 9 */             if (!zI000O01llI0) {
/* 11 */                return i1ii0io;
                    }
/* 12 */            i1ii0io.getClass();
/* 25 */            i1o0Oi.I0000Il00O.I00000oIO(i1ii0io.getClass()).zze(i1ii0io);
/* 28 */            i1ii0io.I0000oI00();
/* 31 */            return this.I00iiI;
                }

                public final Object clone() {
/* 8 */             i1Oo1IIoiolo i1oo1iioiolo = (i1Oo1IIoiolo) this.I00iOIl.I00000oIO(5);
/* 14 */            i1oo1iioiolo.I00iiI = I00000oIO();
/* 20 */            return i1oo1iioiolo;
                }
            }
