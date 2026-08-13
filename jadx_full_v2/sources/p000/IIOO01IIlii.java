            package p000;

            import java.io.EOFException;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class IIOO01IIlii extends IIOOOIl1oI {
                public String I00ilO0;
                public String I00io1l;
                public int I00ioIO;
                public LinkedList I00l0I0l0lO1;
                public ilO110i0o I00l0OO0IO;
                public ConcurrentHashMap I00li1OI;
                public iiOlilo0IIIl I00ll1;

                @Override
                public final List I00000oIO() {
/* 9 */             return (List) this.I00iiI.get("FontMatrix");
                }

                public final IIOl1o I0000oI00(int i) throws EOFException {
/* 3 */             ConcurrentHashMap concurrentHashMap = this.I00li1OI;
/* 13 */            IIOl1o iIOl1o = (IIOl1o) concurrentHashMap.get(Integer.valueOf(i));
/* 15 */            if (iIOl1o != null) {
/* 966 */               return iIOl1o;
                    }
/* 21 */            int iI0000Il00O = this.I00iiO.I0000Il00O(i);
/* 25 */            byte[][] bArr = this.I00iio;
/* 27 */            byte[] bArr2 = bArr[iI0000Il00O];
/* 29 */            int iIntValue = 0;
/* 30 */            if (bArr2 == null) {
/* 32 */                bArr2 = bArr[0];
                    }
/* 36 */            IoOi0looIo ioOi0looIo = new IoOi0looIo();
/* 39 */            ioOi0looIo.I00iOIl = 0;
/* 41 */            ioOi0looIo.I00iiI = 0;
/* 44 */            ioOi0looIo.I00iiO = null;
/* 46 */            Locale locale = Locale.US;
/* 58 */            String.format(locale, "%04x", Integer.valueOf(i));
/* 61 */            byte[][] bArr3 = this.I00ilI0I1;
/* 65 */            int iI00000oIO = this.I00l0OO0IO.I00000oIO(iI0000Il00O);
/* 90 */            List listI00100l0 = ioOi0looIo.I00100l0(bArr2, bArr3, iI00000oIO != -1 ? (byte[][]) ((Map) this.I00l0I0l0lO1.get(iI00000oIO)).get("Subrs") : null, true);
/* 96 */            iiOlilo0IIIl iiolilo0iiil = this.I00ll1;
/* 98 */            String str = this.I00iOIl;
/* 102 */           int iI00000oIO2 = this.I00l0OO0IO.I00000oIO(iI0000Il00O);
/* 106 */           int iIntValue2 = 1000;
/* 108 */           if (iI00000oIO2 != -1) {
/* 119 */               Map map = (Map) this.I00l0I0l0lO1.get(iI00000oIO2);
/* 127 */               if (map.containsKey("defaultWidthX")) {
/* 135 */                   iIntValue2 = ((Number) map.get("defaultWidthX")).intValue();
                        }
                    }
/* 110 */           int i2 = iIntValue2;
/* 142 */           int iI00000oIO3 = this.I00l0OO0IO.I00000oIO(iI0000Il00O);
/* 146 */           if (iI00000oIO3 != -1) {
/* 157 */               Map map2 = (Map) this.I00l0I0l0lO1.get(iI00000oIO3);
/* 165 */               if (map2.containsKey("nominalWidthX")) {
/* 173 */                   iIntValue = ((Number) map2.get("nominalWidthX")).intValue();
                        }
                    }
/* 190 */           IIOl1o iIOl1o2 = new IIOl1o(iiolilo0iiil, str, String.format(locale, "%04x", Integer.valueOf(i)), listI00100l0, i2, iIntValue);
/* 197 */           concurrentHashMap.put(Integer.valueOf(i), iIOl1o2);
/* 200 */           return iIOl1o2;
                }

                @Override
                public final boolean I000II(String str) {
/* 8 */             if (str.startsWith("\\")) {
                        return Integer.parseInt(str.substring(1)) != 0;
                    }
/* 25 */            I000II.I000iOII("Invalid selector");
/* 7 */             return false;
                }

                @Override
                public final float I000O01llI0(String str) throws EOFException {
/* 7 */             if (!str.startsWith("\\")) {
/* 35 */                I000II.I000iOII("Invalid selector");
/* 38 */                return 0.0f;
                    }
/* 18 */            IIOl1o iIOl1oI0000oI00 = I0000oI00(Integer.parseInt(str.substring(1)));
/* 24 */            if (iIOl1oI0000oI00.I0000O == null) {
/* 26 */                iIOl1oI0000oI00.I00000oIO();
                    }
/* 31 */            return iIOl1oI0000oI00.I0000oI00;
                }
            }
