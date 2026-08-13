            package p000;

            import android.view.autofill.AutofillValue;
            import java.io.IOException;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IOooooo0 implements Function1 {
                public final int I00iOIl;
                public Ii000lllIiI I00iiI;

                public IOooooo0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             StringBuilder sb = null;
/* 4 */             boolean z = true;
/* 6 */             Ii000lllIiI ii000lllIiI = this.I00iiI;
                    switch (i) {
                        case 0:
/* 212 */                   OIooliIO0 oIooliIO0 = ii000lllIiI.I00oII.I00111O;
/* 214 */                   Boolean bool = Boolean.TRUE;
/* 216 */                   oIooliIO0.setValue(bool);
/* 223 */                   ii000lllIiI.I00oII.I0010o.setValue(bool);
/* 226 */                   O0oIlOolIO o0oIlOolIO = ii000lllIiI.I00oII;
/* 228 */                   AutofillValue autofillValue = ((I0oI0oiiI1) obj).I00000oIO;
/* 246 */                   Ii000lllIiI.I010o0o0oO(o0oIlOolIO, (String) (autofillValue.isText() ? autofillValue.getTextValue() : null), ii000lllIiI.I00oIiI10, ii000lllIiI.I00oO101o);
/* 249 */                   return bool;
                        case 1:
/* 180 */                   List list = (List) obj;
/* 188 */                   if (ii000lllIiI.I00oII.I0000O() != null) {
/* 198 */                       list.add(ii000lllIiI.I00oII.I0000O().I00000oIO);
                            } else {
/* 202 */                       z = false;
                            }
/* 203 */                   return Boolean.valueOf(z);
                        case 2:
/* 174 */                   Ii000lllIiI.I010o0o0oO(ii000lllIiI.I00oII, ((I1111OO10i) obj).I00iiI, ii000lllIiI.I00oIiI10, ii000lllIiI.I00oO101o);
/* 177 */                   return Boolean.TRUE;
                        default:
/* 11 */                    I1111OO10i i1111OO10i = (I1111OO10i) obj;
/* 15 */                    if (ii000lllIiI.I00oIiI10 || !ii000lllIiI.I00oO101o) {
/* 158 */                       z = false;
                            } else {
/* 25 */                        Oo0i01111o oo0i01111o = ii000lllIiI.I00oII.I0000oI00;
/* 27 */                        if (oo0i01111o != null) {
/* 46 */                            List listI000O01llI0 = IOOi1I.I000O01llI0(new IlIoI1iIOoO0(), new IOi0OoOOIlli(i1111OO10i, 1));
/* 50 */                            O0oIlOolIO o0oIlOolIO2 = ii000lllIiI.I00oII;
/* 52 */                            I1I0i0Ilo1Oi i1I0i0Ilo1Oi = o0oIlOolIO2.I0000O;
/* 54 */                            IOooI1o iOooI1o = o0oIlOolIO2.I001IO000;
/* 56 */                            Oo0OI01Il oo0OI01IlI001lloI = i1I0i0Ilo1Oi.I001lloI(listI000O01llI0);
/* 60 */                            oo0i01111o.I00000oIO(null, oo0OI01IlI001lloI);
/* 63 */                            iOooI1o.invoke(oo0OI01IlI001lloI);
                                } else {
/* 67 */                            Oo0OI01Il oo0OI01Il = ii000lllIiI.I00oI0i;
/* 71 */                            String str = oo0OI01Il.I00000oIO.I00iiI;
/* 73 */                            long j = oo0OI01Il.I00000oOI;
/* 75 */                            int i2 = Oo0lI00l.I0000Il00O;
/* 81 */                            int i3 = (int) (j >> 32);
/* 88 */                            int i4 = (int) (j & 4294967295L);
/* 89 */                            if (i4 >= i3) {
/* 93 */                                sb = new StringBuilder();
/* 96 */                                sb.append((CharSequence) str, 0, i3);
/* 99 */                                sb.append((CharSequence) i1111OO10i);
/* 106 */                               sb.append((CharSequence) str, i4, str.length());
                                    } else {
/* 120 */                               I000II.I0010o(Oi010OO0.I0010o("End index (", i4, ") is less than start index (", i3, ")."));
                                    }
/* 123 */                           String string = sb.toString();
/* 139 */                           int length = i1111OO10i.I00iiI.length() + ((int) (ii000lllIiI.I00oI0i.I00000oOI >> 32));
/* 154 */                           ii000lllIiI.I00oII.I001IO000.invoke(new Oo0OI01Il(4, lOliOi0Oi.I00000oIO(length, length), string));
                                }
                            }
/* 159 */                   return Boolean.valueOf(z);
                    }
                }
            }
