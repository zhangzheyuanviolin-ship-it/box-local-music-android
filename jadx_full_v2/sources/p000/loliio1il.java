            package p000;

            import android.os.Bundle;
            import android.os.Parcel;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public final class loliio1il {
                public int I00000oIO;
                public String I00000oOI;
                public String I0000Il00O;
                public Boolean I0000O;
                public List I0000oI00;
                public iiooOolI1 I0001Ioi1lo;
                public Long I000II;
                public Long I000O01llI0;
                public List I000OOo1O;
                public Double I000OiO;
                public Double I000iOII;
                public lOl10OOloi I000l1;
                public lOl10OOloi I000lI;
                public String I000o00OoI0I;
                public lOliil I000oI1ioi;
                public byte I00100l0;

                public final void I00000oIO(int i) {
/* 1 */             this.I00000oIO = i;
/* 4 */             this.I00100l0 = (byte) 1;
                }

                public final iiooOolI1 I00000oOI() {
                    lOI1lll1l10 loi1lll1l10;
                    lOI1lll1l10 loi1lll1l102;
                    Bundle bundle;
/* 6 */             if (this.I00100l0 != 1) {
/* 280 */               I000II.I001IO000("Missing required properties: type");
/* 276 */               return null;
                    }
/* 8 */             int i = this.I00000oIO;
/* 10 */            String str = this.I00000oOI;
/* 12 */            String str2 = this.I0000Il00O;
/* 14 */            Boolean bool = this.I0000O;
/* 16 */            List list = this.I0000oI00;
/* 18 */            iiooOolI1 iiooooli1 = this.I0001Ioi1lo;
/* 20 */            Long l = this.I000II;
/* 22 */            Long l2 = this.I000O01llI0;
/* 24 */            List<String> list2 = this.I000OOo1O;
/* 26 */            Double d = this.I000OiO;
/* 28 */            Double d2 = this.I000iOII;
/* 30 */            lOl10OOloi lol10ooloi = this.I000l1;
/* 32 */            lOl10OOloi lol10ooloi2 = this.I000lI;
/* 34 */            String str3 = this.I000o00OoI0I;
/* 36 */            lOliil loliil = this.I000oI1ioi;
/* 38 */            if (list2 != null && !list2.isEmpty()) {
/* 46 */                if (loliil == null) {
/* 111 */                   I000II.I000iOII("Required property is set but properties are null or empty.");
/* 107 */                   return null;
                        }
/* 56 */                for (String str4 : list2) {
/* 72 */                    if (!loliil.containsKey(str4)) {
/* 98 */                        I000II.I000iOII(IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str4).length() + 50), "Required property '", str4, "' is not present in properties."));
/* 62 */                        return null;
                            }
                        }
                    }
/* 122 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I = list == null ? null : lOI1lll1l10.I000o00OoI0I(list);
/* 131 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I2 = list2 == null ? null : lOI1lll1l10.I000o00OoI0I(list2);
/* 140 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I3 = lol10ooloi == null ? null : lOI1lll1l10.I000o00OoI0I(lol10ooloi);
/* 151 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I4 = lol10ooloi2 == null ? null : lOI1lll1l10.I000o00OoI0I(lol10ooloi2);
/* 157 */           if (loliil == null || loliil.isEmpty()) {
/* 165 */               loi1lll1l10 = loi1lll1l10I000o00OoI0I;
/* 167 */               loi1lll1l102 = loi1lll1l10I000o00OoI0I2;
/* 168 */               bundle = null;
                    } else {
/* 173 */               Bundle bundle2 = new Bundle();
/* 182 */               Iterator it = ((lOlIO0oi) loliil.entrySet()).iterator();
/* 190 */               while (it.hasNext()) {
/* 196 */                   Map.Entry entry = (Map.Entry) it.next();
/* 202 */                   iiooOolI1 iiooooli12 = (iiooOolI1) entry.getValue();
/* 208 */                   String str5 = (String) entry.getKey();
/* 210 */                   Iterator it2 = it;
/* 214 */                   Bundle bundle3 = new Bundle();
/* 217 */                   lOI1lll1l10 loi1lll1l103 = loi1lll1l10I000o00OoI0I;
/* 219 */                   Parcel parcelObtain = Parcel.obtain();
/* 226 */                   iiiilIIoIi.I00000oIO(iiooooli12, parcelObtain, 0);
/* 235 */                   bundle3.putByteArray("schema_data", parcelObtain.marshall());
/* 238 */                   parcelObtain.recycle();
/* 241 */                   bundle2.putBundle(str5, bundle3);
/* 244 */                   it = it2;
/* 246 */                   loi1lll1l10I000o00OoI0I = loi1lll1l103;
/* 248 */                   loi1lll1l10I000o00OoI0I2 = loi1lll1l10I000o00OoI0I2;
                        }
/* 251 */               loi1lll1l10 = loi1lll1l10I000o00OoI0I;
/* 253 */               loi1lll1l102 = loi1lll1l10I000o00OoI0I2;
/* 254 */               bundle = bundle2;
                    }
/* 272 */           return new iiooOolI1(i, str, str2, bool, loi1lll1l10, iiooooli1, l, l2, loi1lll1l102, null, null, d, d2, null, null, null, loi1lll1l10I000o00OoI0I3, loi1lll1l10I000o00OoI0I4, str3, bundle);
                }
            }
