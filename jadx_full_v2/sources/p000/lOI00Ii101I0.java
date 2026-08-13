            package p000;

            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            
            public final class lOI00Ii101I0 {
                public static loll11I I000OiO;
                public static final ii01iIOliOOI I000iOII;
                public String I00000oIO;
                public String I00000oOI;
                public lO1OIOl0Oi I0000Il00O;
                public Oioo1I0o I0000O;
                public o0IiOl I0000oI00;
                public o0IiOl I0001Ioi1lo;
                public String I000II;
                public int I000O01llI0;
                public HashMap I000OOo1O;

                static {
/* 5 */             Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
/* 12 */            objArr[0].getClass();
/* 18 */            objArr[1].getClass();
/* 24 */            ii01iIOliOOI ii01iioliooi = new ii01iIOliOOI(7);
/* 27 */            ii01iioliooi.I00iiI = objArr;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            I000iOII = ii01iioliooi;
                }

                public final void I00000oIO(lOOIo0IlO looio0ilo, l1Iii1 l1iii1) {
/* 1 */             o0IiOl o0iiol = this.I0000oI00;
/* 3 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 7 */             HashMap map = this.I000OOo1O;
/* 13 */            if (map.get(l1iii1) != null && jElapsedRealtime - ((Long) map.get(l1iii1)).longValue() <= 30000) {
/* 34 */                return;
                    }
/* 39 */            map.put(l1iii1, Long.valueOf(jElapsedRealtime));
/* 42 */            int i = looio0ilo.I00000oIO;
/* 44 */            int i2 = looio0ilo.I00000oOI;
/* 46 */            int i3 = looio0ilo.I0000Il00O;
/* 48 */            int i4 = looio0ilo.I0000O;
/* 50 */            int i5 = looio0ilo.I0000oI00;
/* 52 */            long j = looio0ilo.I0001Ioi1lo;
/* 54 */            int i6 = looio0ilo.I000II;
/* 91 */            l10lOI0l l10loi0l = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? l10lOI0l.UNKNOWN_FORMAT : l10lOI0l.NV21 : l10lOI0l.NV16 : l10lOI0l.YV12 : l10lOI0l.YUV_420_888 : l10lOI0l.BITMAP;
/* 117 */           l11i0l0OIl l11i0l0oil = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? l11i0l0OIl.ANDROID_MEDIA_IMAGE : l11i0l0OIl.FILEPATH : l11i0l0OIl.BYTEBUFFER : l11i0l0OIl.BYTEARRAY : l11i0l0OIl.BITMAP;
/* 123 */           Integer numValueOf = Integer.valueOf(i3 & Integer.MAX_VALUE);
/* 128 */           Integer numValueOf2 = Integer.valueOf(i4 & Integer.MAX_VALUE);
/* 133 */           Integer numValueOf3 = Integer.valueOf(i5 & Integer.MAX_VALUE);
/* 143 */           Long lValueOf = Long.valueOf(j & Long.MAX_VALUE);
/* 148 */           Integer numValueOf4 = Integer.valueOf(i6 & Integer.MAX_VALUE);
/* 154 */           l11oOo0i0IiO l11ooo0i0iio = new l11oOo0i0IiO();
/* 157 */           l11ooo0i0iio.I00000oIO = lValueOf;
/* 159 */           l11ooo0i0iio.I00000oOI = l11i0l0oil;
/* 161 */           l11ooo0i0iio.I0000Il00O = l10loi0l;
/* 163 */           l11ooo0i0iio.I0000O = numValueOf;
/* 165 */           l11ooo0i0iio.I0000oI00 = numValueOf3;
/* 167 */           l11ooo0i0iio.I0001Ioi1lo = numValueOf2;
/* 169 */           l11ooo0i0iio.I000II = numValueOf4;
/* 171 */           VarHandle.storeStoreFence();
/* 176 */           l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 179 */           l1il1ilioi1l.I00iiO = l11ooo0i0iio;
/* 185 */           OoIOol ooIOol = new OoIOol(14);
/* 194 */           ooIOol.I00iiO = new IIlOoolol0ll(5);
/* 196 */           ooIOol.I00iiI = l1il1ilioi1l;
/* 198 */           lOOlOoll.I0000O();
/* 201 */           VarHandle.storeStoreFence();
/* 221 */           String strI00000oIO = o0iiol.I000OOo1O() ? (String) o0iiol.I000II() : O0oO1lOOo1.I0000Il00O.I00000oIO(this.I000II);
/* 229 */           IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(13);
/* 232 */           iO0iIlI1li.I00iiI = this;
/* 234 */           iO0iIlI1li.I00iiO = ooIOol;
/* 236 */           iO0iIlI1li.I00iio = l1iii1;
/* 238 */           iO0iIlI1li.I00ilI0I1 = strI00000oIO;
/* 240 */           VarHandle.storeStoreFence();
/* 243 */           io1OllI.I00000oIO(1, iO0iIlI1li);
                }
            }
