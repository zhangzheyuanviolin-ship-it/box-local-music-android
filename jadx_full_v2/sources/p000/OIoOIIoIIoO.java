            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIoOIIoIIoO implements IlOIll0o11Ii {
                public Ol1iIOI I00000oIO;
                public OIoIoIO0oI1O I00000oOI;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(OiOiliiO oiOiliiO, float f, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OIoO1liI0 oIoO1liI0;
/* 1 */             OIoIoIO0oI1O oIoIoIO0oI1O = this.I00000oOI;
/* 5 */             if (iOoil1iiIilo instanceof OIoO1liI0) {
/* 8 */                 oIoO1liI0 = (OIoO1liI0) iOoil1iiIilo;
/* 10 */                int i = oIoO1liI0.I00iiO;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oIoO1liI0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    oIoO1liI0 = new OIoO1liI0(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 29 */            Object objI0000Il00O = oIoO1liI0.I00iOIl;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = oIoO1liI0.I00iiO;
/* 35 */            int i3 = 0;
/* 36 */            IOoil1iiIilo iOoil1iiIilo2 = null;
/* 38 */            if (i2 == 0) {
/* 52 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 55 */                Ol1iIOI ol1iIOI = this.I00000oIO;
/* 59 */                OIoO1Ol oIoO1Ol = new OIoO1Ol(i3);
/* 62 */                oIoO1Ol.I00iiI = this;
/* 64 */                VarHandle.storeStoreFence();
/* 67 */                oIoO1liI0.I00iiO = 1;
/* 69 */                objI0000Il00O = ol1iIOI.I0000Il00O(oiOiliiO, f, oIoO1Ol, oIoO1liI0);
/* 73 */                if (objI0000Il00O == ii0111o) {
/* 75 */                    return ii0111o;
                        }
                    } else {
/* 40 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                    return null;
                        }
/* 42 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
                    }
/* 78 */            float fFloatValue = ((Number) objI0000Il00O).floatValue();
/* 89 */            if (oIoIoIO0oI1O.I000l1() != 0.0f && Math.abs(oIoIoIO0oI1O.I000l1()) < 0.001d) {
/* 110 */               int iI000iOII = oIoIoIO0oI1O.I000iOII();
/* 120 */               if (oIoIoIO0oI1O.I000iOII.I00000oIO()) {
/* 139 */                   iOi1II01i0.I0000O(((OIoI1lIli) oIoIoIO0oI1O.I000lI.getValue()).I0010o, null, null, new OIoI0lloOol(oIoIoIO0oI1O, iOoil1iiIilo2, 2), 3);
                        }
/* 142 */               oIoIoIO0oI1O.I001IIilI0O(iI000iOII, 0.0f, false);
                    } else {
/* 152 */               new Float(oIoIoIO0oI1O.I000l1());
                    }
/* 157 */           return new Float(fFloatValue);
                }
            }
