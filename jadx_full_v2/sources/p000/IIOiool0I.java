            package p000;

            import java.io.EOFException;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class IIOiool0I extends IIOOOIl1oI implements Il01o0OlloO {
                public LinkedHashMap I00ilO0;
                public IIOO0l I00io1l;
                public ConcurrentHashMap I00ioIO;
                public IIOOoll I00l0I0l0lO1;

                @Override
                public final List I00000oIO() {
/* 9 */             return (List) this.I00iiI.get("FontMatrix");
                }

                @Override
                public final I01loIooI I00000oOI() {
/* 1 */             return this.I00io1l;
                }

                public final OoIolOO1 I0000oI00(int i, String str) throws EOFException {
/* 5 */             LinkedHashMap linkedHashMap = this.I00ilO0;
/* 7 */             ConcurrentHashMap concurrentHashMap = this.I00ioIO;
/* 17 */            OoIolOO1 ooIolOO1 = (OoIolOO1) concurrentHashMap.get(Integer.valueOf(i));
/* 19 */            if (ooIolOO1 != null) {
/* 551 */               return ooIolOO1;
                    }
/* 21 */            byte[][] bArr = this.I00iio;
/* 30 */            byte[] bArr2 = i < bArr.length ? bArr[i] : null;
/* 32 */            if (bArr2 == null) {
/* 34 */                bArr2 = bArr[0];
                    }
/* 38 */            IoOi0looIo ioOi0looIo = new IoOi0looIo();
/* 41 */            ioOi0looIo.I00iOIl = 0;
/* 43 */            ioOi0looIo.I00iiI = 0;
/* 45 */            ioOi0looIo.I00iiO = null;
/* 58 */            List listI00100l0 = ioOi0looIo.I00100l0(bArr2, this.I00ilI0I1, (byte[][]) linkedHashMap.get("Subrs"), true);
/* 64 */            IIOOoll iIOOoll = this.I00l0I0l0lO1;
/* 66 */            String str2 = this.I00iOIl;
/* 68 */            LinkedHashMap linkedHashMap2 = this.I00iiI;
/* 72 */            Object obj = linkedHashMap2.get("defaultWidthX");
/* 76 */            if (obj == null) {
/* 79 */                obj = linkedHashMap.get("defaultWidthX");
                    }
/* 83 */            Number number = (Number) obj;
/* 91 */            int iIntValue = number == null ? 1000 : number.intValue();
/* 98 */            Object obj2 = linkedHashMap2.get("nominalWidthX");
/* 102 */           if (obj2 == null) {
/* 105 */               obj2 = linkedHashMap.get("nominalWidthX");
                    }
/* 109 */           Number number2 = (Number) obj2;
/* 123 */           OoIolOO1 ooIolOO12 = new OoIolOO1(iIOOoll, str2, str, listI00100l0, iIntValue, number2 != null ? number2.intValue() : 0);
/* 130 */           concurrentHashMap.put(Integer.valueOf(i), ooIolOO12);
/* 133 */           return ooIolOO12;
                }

                @Override
                public final boolean I000II(String str) {
/* 1 */             IIOO0I iioo0i = this.I00iiO;
/* 6 */             if (iioo0i.I00000oIO) {
/* 37 */                I000II.I001IO000("Not a Type 1-equivalent font");
/* 5 */                 return false;
                    }
/* 14 */            Integer num = (Integer) iioo0i.I0000O.get(str);
                    return this.I00iiO.I0000O(num == null ? 0 : num.intValue()) != 0;
                }

                @Override
                public final float I000O01llI0(String str) throws EOFException {
/* 1 */             IIOO0I iioo0i = this.I00iiO;
/* 5 */             if (iioo0i.I00000oIO) {
/* 46 */                I000II.I001IO000("Not a Type 1-equivalent font");
/* 49 */                return 0.0f;
                    }
/* 13 */            Integer num = (Integer) iioo0i.I0000O.get(str);
/* 29 */            OoIolOO1 ooIolOO1I0000oI00 = I0000oI00(this.I00iiO.I0000O(num == null ? 0 : num.intValue()), str);
/* 35 */            if (ooIolOO1I0000oI00.I0000O == null) {
/* 37 */                ooIolOO1I0000oI00.I00000oIO();
                    }
/* 42 */            return ooIolOO1I0000oI00.I0000oI00;
                }
            }
