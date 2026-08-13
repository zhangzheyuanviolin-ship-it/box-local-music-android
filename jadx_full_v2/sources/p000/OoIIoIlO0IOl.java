            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class OoIIoIlO0IOl implements Function3 {
                public int I00iOIl;
                public OoIO11oiiiil I00iiI;
                public StringBuilder I00iiO;
                public long I00iio;
                public OoIIOoO I00ilI0I1;
                public OoI1lOl I00ilO0;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoIO11oiiiil ooIO11oiiiil = this.I00iiI;
/* 7 */             StringBuilder sb = this.I00iiO;
/* 9 */             long j = this.I00iio;
/* 11 */            OoIIOoO ooIIOoO = this.I00ilI0I1;
/* 13 */            OoI1lOl ooI1lOl = this.I00ilO0;
/* 17 */            String str = (String) obj;
/* 23 */            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
/* 31 */            int i2 = ooIO11oiiiil.I000O01llI0;
/* 33 */            OlO0OIIl1 olO0OIIl1 = ooIO11oiiiil.I00000oOI;
/* 35 */            if (i == i2) {
/* 37 */                sb.append(str);
/* 44 */                Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(15);
/* 47 */                ol1OiIli00Ii.I00iiI = sb;
/* 49 */                VarHandle.storeStoreFence();
/* 52 */                ooIO11oiiiil.I000l1(j, ol1OiIli00Ii);
/* 55 */                if (zBooleanValue) {
/* 65 */                    String string = OlOoOIi0o.I00OIo(sb.toString()).toString();
/* 72 */                    OlOoOOIIi olOoOOIIi = new OlOoOOIIi(6);
/* 75 */                    olOoOOIIi.I00iiI = string;
/* 77 */                    VarHandle.storeStoreFence();
/* 80 */                    ooIO11oiiiil.I000l1(j, olOoOOIIi);
/* 110 */                   olO0OIIl1.I000lI(null, OoIIo0oOI1.I00000oIO((OoIIo0oOI1) olO0OIIl1.getValue(), null, null, OoII00OiO.I00iOIl, null, null, null, false, false, 243));
/* 117 */                   if (string.length() != 0 && (!((OoIIo0oOI1) olO0OIIl1.getValue()).I000O01llI0 || !ooIO11oiiiil.I000O01llI0(string, ooI1lOl, ooIIOoO))) {
/* 139 */                       ooIO11oiiiil.I0000oI00(ooIIOoO, 1200L);
                            }
                        }
                    }
/* 142 */           return OoiIlOl1iI.I00000oIO;
                }
            }
