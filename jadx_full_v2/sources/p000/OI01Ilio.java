            package p000;

            import android.content.ContentResolver;
            import android.content.Context;
            import android.net.Uri;
            import android.os.Handler;
            import android.os.Looper;
            import android.provider.Settings;
            
            public final class OI01Ilio implements OI01II0li {
                public Context I00iOIl;
                public IIOlO1ii I00iiI;
                public OIooO1iiliI I00iiO;
                public OlIl0i I00iio;

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oOI(this, ii00l0i1loO);
                }

                @Override
                public final float I00OOll1() {
                    OlO0I1lIii1 olO0I1lIii1;
/* 3 */             if (this.I00iio == null) {
/* 5 */                 Context context = this.I00iOIl;
/* 7 */                 OI10I1IoI0Ol oI10I1IoI0Ol = i0101iOI1I.I00000oIO;
                        synchronized (oI10I1IoI0Ol) {
                            try {
/* 10 */                        Object objI000II = oI10I1IoI0Ol.I000II(context);
/* 16 */                        if (objI000II == null) {
/* 18 */                            ContentResolver contentResolver = context.getContentResolver();
/* 24 */                            Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
/* 30 */                            IIIII1OI1 iiiii1oi1I00000oIO = iOl1iOi0I.I00000oIO(-1, null, null, 6);
/* 53 */                            Ii1Io1loiI ii1Io1loiII00000oOI = ilOl0O00Il0i.I00000oOI(new I1iIiIIIio0(contentResolver, uriFor, new i0100lioil(iiiii1oi1I00000oIO, Handler.createAsync(Looper.getMainLooper())), iiiii1oi1I00000oIO, context, (IOoil1iiIilo) null));
/* 59 */                            Oliiii0 oliiii0I00000oIO = lOi1li0o0.I00000oIO();
/* 63 */                            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 94 */                            objI000II = ilOoiIi101.I0000Il00O(ii1Io1loiII00000oOI, new IIOlO1ii(iiollilo0IO1.I00000oIO(oliiii0I00000oIO, O1OI1l011OO1.I00000oIO)), Ol00III.I00000oIO(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
/* 98 */                            oI10I1IoI0Ol.I000lI(context, objI000II);
                                }
/* 105 */                       olO0I1lIii1 = (OlO0I1lIii1) objI000II;
                            } catch (Throwable th) {
/* 148 */                       throw th;
                            }
                        }
/* 120 */               this.I00iiO.I000O01llI0(((Number) olO0I1lIii1.getValue()).floatValue());
/* 123 */               IIOlO1ii iIOlO1ii = this.I00iiI;
/* 125 */               if (iIOlO1ii == null) {
/* 142 */                   I000II.I001IO000("MotionDurationScale scale factor requested before recomposer loop start");
/* 145 */                   return 0.0f;
                        }
/* 137 */               this.I00iio = iOi1II01i0.I0000O(iIOlO1ii, null, null, new O1iIlllIoo(olO0I1lIii1, this, null, 4), 3);
                    }
/* 151 */           return this.I00iiO.I000II();
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oIO(this, ii00l0i1loO);
                }
            }
