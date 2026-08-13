            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            
            public final class Olio00O {
                public static final OlOOI001 I0000oI00 = OlOOI001.I00iiI;
                public static final Olill0O0OOIO[] I0001Ioi1lo = {Olill0O0OOIO.I00ilI0I1, Olill0O0OOIO.I00io1l, Olill0O0OOIO.I00ioIO, Olill0O0OOIO.I00l0OO0IO, Olill0O0OOIO.I00li1OI, Olill0O0OOIO.I00iio};
                public static final Map I000II;
                public static final LinkedHashMap I000O01llI0;
                public Olilol I00000oIO;
                public Olill0O0OOIO I00000oOI;
                public OlOOI001 I0000Il00O;
                public int I0000O;

                static {
/* 92 */            Map mapI0000O = O1Oii0O0loo.I0000O(new OIoi0IIoi(Olilol.I00iiI, 35), new OIoi0IIoi(Olilol.I00iiO, Integer.valueOf(Barcode.FORMAT_QR_CODE)), new OIoi0IIoi(Olilol.I00iio, 4101), new OIoi0IIoi(Olilol.I00ilI0I1, 32), new OIoi0IIoi(Olilol.I00iOIl, 34));
/* 96 */            I000II = mapI0000O;
/* 98 */            Set<Map.Entry> setEntrySet = mapI0000O.entrySet();
/* 110 */           int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(setEntrySet, 10));
/* 116 */           if (iI00000oIO < 16) {
/* 118 */               iI00000oIO = 16;
                    }
/* 121 */           LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 132 */           for (Map.Entry entry : setEntrySet) {
/* 160 */               linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (Olilol) entry.getKey());
                    }
/* 164 */           I000O01llI0 = linkedHashMap;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 33 */                return true;
                    }
/* 6 */             if (!(obj instanceof Olio00O)) {
/* 31 */                return false;
                    }
/* 9 */             Olio00O olio00O = (Olio00O) obj;
                    return this.I00000oIO == olio00O.I00000oIO && this.I00000oOI == olio00O.I00000oOI && this.I0000Il00O == olio00O.I0000Il00O;
                }

                public final int hashCode() {
/* 24 */            return this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "SurfaceConfig(configType=" + this.I00000oIO + ", configSize=" + this.I00000oOI + ", streamUseCase=" + this.I0000Il00O + ')';
                }
            }
