            package p000;

            import android.graphics.Bitmap;
            import android.graphics.BlendModeColorFilter;
            import java.lang.invoke.VarHandle;
            
            public final class Ooo0Oo01l extends Oolo0Oli0lOo {
                public Io10liI0o I00000oOI;
                public String I0000Il00O;
                public boolean I0000O;
                public IilliiOI0Ol0 I0000oI00;
                public IllOOo00lI I0001Ioi1lo;
                public OIooliIO0 I000II;
                public II0oIl I000O01llI0;
                public OIooliIO0 I000OOo1O;
                public long I000OiO;
                public float I000iOII;
                public float I000l1;
                public Ooo0OiI11Ol I000lI;

                @Override
                public final void I00000oIO(IilloIOOO0i iilloIOOO0i) {
/* 4 */             I0000oI00(iilloIOOO0i, 1.0f, null);
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000oI00(IilloIOOO0i iilloIOOO0i, float f, IOOil0 iOOil0) {
                    int i;
                    II0oIl iI0oIl;
                    char c;
                    long j;
                    IilloIOOO0i iilloIOOO0i2;
                    IOOil0 iOOil02;
                    int i2;
                    int i3;
/* 5 */             OIooliIO0 oIooliIO0 = this.I000OOo1O;
/* 7 */             OIooliIO0 oIooliIO02 = this.I000II;
/* 9 */             IilliiOI0Ol0 iilliiOI0Ol0 = this.I0000oI00;
/* 11 */            Io10liI0o io10liI0o = this.I00000oOI;
/* 17 */            if (!io10liI0o.I0000O || io10liI0o.I0000oI00 == 16) {
/* 71 */                i = 0;
                    } else {
/* 31 */                IOOil0 iOOil03 = (IOOil0) oIooliIO02.getValue();
/* 33 */                int i4 = Ooo1iOO.I00000oIO;
/* 38 */                if (!(iOOil03 instanceof II0oIl) ? iOOil03 == null : !((i3 = ((II0oIl) iOOil03).I0000Il00O) != 5 && i3 != 3)) {
/* 54 */                    if (!(iOOil0 instanceof II0oIl) ? iOOil0 == null : !((i2 = ((II0oIl) iOOil0).I0000Il00O) != 5 && i2 != 3)) {
/* 69 */                        i = 1;
                            }
                        }
                    }
/* 74 */            if (this.I0000O || !Ol0i1I.I00000oOI(this.I000OiO, iilloIOOO0i.I0000oI00())) {
/* 104 */               if (i == 1) {
/* 106 */                   long jI0000Il00O = io10liI0o.I0000oI00;
/* 108 */                   int i5 = Ooo1iOO.I00000oIO;
/* 118 */                   if (IOOiio0i.I0000O(jI0000Il00O) != 1.0f) {
/* 121 */                       jI0000Il00O = IOOiio0i.I0000Il00O(1.0f, jI0000Il00O);
                            }
/* 140 */                   iI0oIl = new II0oIl(new BlendModeColorFilter(iiO01ll11o1l.I000OOo1O(jI0000Il00O), iOIill.I00000oIO(5)));
/* 143 */                   iI0oIl.I00000oOI = jI0000Il00O;
/* 145 */                   iI0oIl.I0000Il00O = 5;
/* 147 */                   VarHandle.storeStoreFence();
                        } else {
/* 151 */                   iI0oIl = null;
                        }
/* 152 */               this.I000O01llI0 = iI0oIl;
/* 181 */               this.I000iOII = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) / Float.intBitsToFloat((int) (((Ol0i1I) oIooliIO0.getValue()).I00000oIO >> 32));
/* 213 */               this.I000l1 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) / Float.intBitsToFloat((int) (((Ol0i1I) oIooliIO0.getValue()).I00000oIO & 4294967295L));
/* 253 */               long jCeil = (((int) Math.ceil(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)))) << 32);
/* 254 */               O0iOOoiioO layoutDirection = iilloIOOO0i.getLayoutDirection();
/* 258 */               Ooo0OiI11Ol ooo0OiI11Ol = this.I000lI;
/* 260 */               I0oO00o i0oO00oI00000oIO = iilliiOI0Ol0.I00000oIO;
/* 262 */               I0lIooIo1 i0lIooIo1I00000oIO = iilliiOI0Ol0.I00000oOI;
/* 264 */               if (i0oO00oI00000oIO == null || i0lIooIo1I00000oIO == null) {
/* 296 */                   c = ' ';
/* 298 */                   j = 4294967295L;
                        } else {
/* 268 */                   j = 4294967295L;
/* 271 */                   int i6 = (int) (jCeil >> 32);
/* 272 */                   Bitmap bitmap = i0oO00oI00000oIO.I00000oIO;
/* 274 */                   c = ' ';
/* 280 */                   if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || iilliiOI0Ol0.I0000O != i) {
                            }
/* 319 */                   iilliiOI0Ol0.I0000Il00O = jCeil;
/* 321 */                   IIolilIo iIolilIo = iilliiOI0Ol0.I0000oI00;
/* 323 */                   long jI00000oOI = l000O1l.I00000oOI(jCeil);
/* 327 */                   IIolil1 iIolil1 = iIolilIo.I00iOIl;
/* 329 */                   IiIooOOOI iiIooOOOI = iIolil1.I00000oIO;
/* 331 */                   O0iOOoiioO o0iOOoiioO = iIolil1.I00000oOI;
/* 333 */                   IIolOo iIolOo = iIolil1.I0000Il00O;
/* 337 */                   long j2 = iIolil1.I0000O;
/* 339 */                   iilloIOOO0i2 = iilloIOOO0i;
/* 341 */                   iIolil1.I00000oIO = iilloIOOO0i2;
/* 343 */                   iIolil1.I00000oOI = layoutDirection;
/* 345 */                   iIolil1.I0000Il00O = i0lIooIo1I00000oIO;
/* 349 */                   iIolil1.I0000O = jI00000oOI;
/* 351 */                   i0lIooIo1I00000oIO.I000II();
/* 368 */                   IilloIOOO0i.I00ilI0I1(iIolilIo, IOOiio0i.I00000oOI, 0L, 0L, 0.0f, null, 0, 62);
/* 371 */                   ooo0OiI11Ol.invoke(iIolilIo);
/* 374 */                   i0lIooIo1I00000oIO.I00100l0();
/* 377 */                   IIolil1 iIolil12 = iIolilIo.I00iOIl;
/* 379 */                   iIolil12.I00000oIO = iiIooOOOI;
/* 381 */                   iIolil12.I00000oOI = o0iOOoiioO;
/* 383 */                   iIolil12.I0000Il00O = iIolOo;
/* 385 */                   iIolil12.I0000O = j2;
/* 389 */                   i0oO00oI00000oIO.I00000oIO.prepareToDraw();
/* 393 */                   this.I0000O = false;
/* 399 */                   this.I000OiO = iilloIOOO0i2.I0000oI00();
                        }
/* 305 */               i0oO00oI00000oIO = ioIIOlOIO0.I00000oIO((int) (jCeil >> c), (int) (jCeil & j), i);
/* 309 */               i0lIooIo1I00000oIO = I0lO01i00oi.I00000oIO(i0oO00oI00000oIO);
/* 313 */               iilliiOI0Ol0.I00000oIO = i0oO00oI00000oIO;
/* 315 */               iilliiOI0Ol0.I00000oOI = i0lIooIo1I00000oIO;
/* 317 */               iilliiOI0Ol0.I0000O = i;
/* 319 */               iilliiOI0Ol0.I0000Il00O = jCeil;
/* 321 */               IIolilIo iIolilIo2 = iilliiOI0Ol0.I0000oI00;
/* 323 */               long jI00000oOI2 = l000O1l.I00000oOI(jCeil);
/* 327 */               IIolil1 iIolil13 = iIolilIo2.I00iOIl;
/* 329 */               IiIooOOOI iiIooOOOI2 = iIolil13.I00000oIO;
/* 331 */               O0iOOoiioO o0iOOoiioO2 = iIolil13.I00000oOI;
/* 333 */               IIolOo iIolOo2 = iIolil13.I0000Il00O;
/* 337 */               long j22 = iIolil13.I0000O;
/* 339 */               iilloIOOO0i2 = iilloIOOO0i;
/* 341 */               iIolil13.I00000oIO = iilloIOOO0i2;
/* 343 */               iIolil13.I00000oOI = layoutDirection;
/* 345 */               iIolil13.I0000Il00O = i0lIooIo1I00000oIO;
/* 349 */               iIolil13.I0000O = jI00000oOI2;
/* 351 */               i0lIooIo1I00000oIO.I000II();
/* 368 */               IilloIOOO0i.I00ilI0I1(iIolilIo2, IOOiio0i.I00000oOI, 0L, 0L, 0.0f, null, 0, 62);
/* 371 */               ooo0OiI11Ol.invoke(iIolilIo2);
/* 374 */               i0lIooIo1I00000oIO.I00100l0();
/* 377 */               IIolil1 iIolil122 = iIolilIo2.I00iOIl;
/* 379 */               iIolil122.I00000oIO = iiIooOOOI2;
/* 381 */               iIolil122.I00000oOI = o0iOOoiioO2;
/* 383 */               iIolil122.I0000Il00O = iIolOo2;
/* 385 */               iIolil122.I0000O = j22;
/* 389 */               i0oO00oI00000oIO.I00000oIO.prepareToDraw();
/* 393 */               this.I0000O = false;
/* 399 */               this.I000OiO = iilloIOOO0i2.I0000oI00();
                    } else {
/* 88 */                I0oO00o i0oO00o = iilliiOI0Ol0.I00000oIO;
/* 98 */                if (i == (i0oO00o != null ? i0oO00o.I00000oIO() : 0)) {
/* 100 */                   iilloIOOO0i2 = iilloIOOO0i;
                        }
                    }
/* 401 */           if (iOOil0 != null) {
/* 403 */               iOOil02 = iOOil0;
                    } else {
/* 423 */               iOOil02 = ((IOOil0) oIooliIO02.getValue()) != null ? (IOOil0) oIooliIO02.getValue() : this.I000O01llI0;
                    }
/* 426 */           I0oO00o i0oO00o2 = iilliiOI0Ol0.I00000oIO;
/* 428 */           if (i0oO00o2 == null) {
/* 433 */               IolioOO1.I0000Il00O("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
/* 456 */           IilloIOOO0i.I00Ol1ll1(iilloIOOO0i2, i0oO00o2, 0L, iilliiOI0Ol0.I0000Il00O, 0L, 0L, f, iOOil02, 0, 858);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Params: \tname: ");
/* 10 */            sb.append(this.I0000Il00O);
/* 15 */            sb.append("\n\tviewportWidth: ");
/* 18 */            OIooliIO0 oIooliIO0 = this.I000OOo1O;
/* 36 */            sb.append(Float.intBitsToFloat((int) (((Ol0i1I) oIooliIO0.getValue()).I00000oIO >> 32)));
/* 41 */            sb.append("\n\tviewportHeight: ");
/* 63 */            sb.append(Float.intBitsToFloat((int) (((Ol0i1I) oIooliIO0.getValue()).I00000oIO & 4294967295L)));
/* 68 */            sb.append("\n");
/* 71 */            return sb.toString();
                }
            }
