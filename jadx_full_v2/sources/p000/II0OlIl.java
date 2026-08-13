            package p000;

            import android.util.Log;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.Executor;
            
            public final class II0OlIl implements OIOilII0IlO {
                public final int I00iOIl;
                public Object I00iiI;

                @Override
                public final void I00000oOI(Object obj) {
                    HashMap map;
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 8;
/* 8 */             String strI000o00OoI0I = null;
/* 9 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 316 */                   II0i11 iI0i11 = (II0i11) obj2;
/* 318 */                   II0iil1 iI0iil1 = (II0iil1) obj;
/* 320 */                   if (iI0iil1 != null) {
/* 322 */                       iI0i11.I00O0i0ii(iI0iil1);
/* 325 */                       II0lI0lO1 iI0lI0lO1 = iI0i11.I0110OiO;
/* 327 */                       OI0lOii0I oI0lOii0I = iI0lI0lO1.I000l1;
/* 329 */                       if (oI0lOii0I == null) {
/* 333 */                           oI0lOii0I = new OI0lOii0I();
/* 336 */                           iI0lI0lO1.I000l1 = oI0lOii0I;
                                }
/* 338 */                       II0lI0lO1.I000II(oI0lOii0I, null);
/* 341 */                       return;
                            }
/* 341 */                   return;
                        case 1:
/* 251 */                   II0i11 iI0i112 = (II0i11) obj2;
/* 253 */                   II0OiOOI iI0OiOOI = (II0OiOOI) obj;
/* 255 */                   if (iI0OiOOI != null) {
/* 257 */                       int i3 = iI0OiOOI.I00000oIO;
/* 259 */                       CharSequence charSequence = iI0OiOOI.I00000oOI;
                                switch (i3) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
/* 265 */                               i2 = i3;
                                        break;
                                }
/* 266 */                       iI0i112.I00IoiI();
/* 269 */                       if (charSequence == null) {
/* 292 */                           charSequence = iI0i112.I000o00OoI0I(R.string.default_error_msg) + " " + i2;
                                }
/* 296 */                       iI0i112.I00Iooi00oi(i2, charSequence);
/* 299 */                       II0lI0lO1 iI0lI0lO12 = iI0i112.I0110OiO;
/* 301 */                       OI0lOii0I oI0lOii0I2 = iI0lI0lO12.I000lI;
/* 303 */                       if (oI0lOii0I2 == null) {
/* 307 */                           oI0lOii0I2 = new OI0lOii0I();
/* 310 */                           iI0lI0lO12.I000lI = oI0lOii0I2;
                                }
/* 312 */                       II0lI0lO1.I000II(oI0lOii0I2, null);
/* 315 */                       return;
                            }
/* 315 */                   return;
                        case 2:
/* 225 */                   II0i11 iI0i113 = (II0i11) obj2;
/* 229 */                   if (((CharSequence) obj) != null) {
/* 231 */                       iI0i113.I00IoiI();
/* 234 */                       II0lI0lO1 iI0lI0lO13 = iI0i113.I0110OiO;
/* 236 */                       OI0lOii0I oI0lOii0I3 = iI0lI0lO13.I000lI;
/* 238 */                       if (oI0lOii0I3 == null) {
/* 242 */                           oI0lOii0I3 = new OI0lOii0I();
/* 245 */                           iI0lI0lO13.I000lI = oI0lOii0I3;
                                }
/* 247 */                       II0lI0lO1.I000II(oI0lOii0I3, null);
/* 250 */                       return;
                            }
/* 250 */                   return;
                        case 3:
/* 162 */                   II0i11 iI0i114 = (II0i11) obj2;
/* 170 */                   if (((Boolean) obj).booleanValue()) {
/* 172 */                       iI0i114.I00IoiI();
/* 175 */                       II0lI0lO1 iI0lI0lO14 = iI0i114.I0110OiO;
/* 179 */                       if (iI0lI0lO14.I000OiO) {
/* 189 */                           Executor executorI0000oI00 = iI0lI0lO14.I0000oI00();
/* 195 */                           I0100i i0100i = new I0100i(i2);
/* 198 */                           i0100i.I00iiI = iI0i114;
/* 200 */                           VarHandle.storeStoreFence();
/* 203 */                           executorI0000oI00.execute(i0100i);
                                } else {
/* 185 */                           Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                                }
/* 206 */                       II0lI0lO1 iI0lI0lO15 = iI0i114.I0110OiO;
/* 208 */                       OI0lOii0I oI0lOii0I4 = iI0lI0lO15.I000oI1ioi;
/* 210 */                       if (oI0lOii0I4 == null) {
/* 214 */                           oI0lOii0I4 = new OI0lOii0I();
/* 217 */                           iI0lI0lO15.I000oI1ioi = oI0lOii0I4;
                                }
/* 221 */                       II0lI0lO1.I000II(oI0lOii0I4, Boolean.FALSE);
/* 224 */                       return;
                            }
/* 224 */                   return;
                        case 4:
/* 116 */                   II0i11 iI0i115 = (II0i11) obj2;
/* 124 */                   if (((Boolean) obj).booleanValue()) {
/* 128 */                       II0ilOIlloOl iI0ilOIlloOl = iI0i115.I0110OiO.I0000O;
/* 130 */                       if (iI0ilOIlloOl != null && (strI000o00OoI0I = iI0ilOIlloOl.I0000Il00O) == null) {
/* 137 */                           strI000o00OoI0I = "";
                                }
/* 139 */                       if (strI000o00OoI0I == null) {
/* 142 */                           strI000o00OoI0I = iI0i115.I000o00OoI0I(R.string.default_error_msg);
                                }
/* 148 */                       iI0i115.I00Iooi00oi(13, strI000o00OoI0I);
/* 152 */                       iI0i115.I00IoIO0lI(2);
/* 158 */                       iI0i115.I0110OiO.I0001Ioi1lo(false);
/* 161 */                       return;
                            }
/* 161 */                   return;
                        case 5:
/* 80 */                    II0i11 iI0i116 = (II0i11) obj2;
/* 88 */                    if (((Boolean) obj).booleanValue()) {
/* 91 */                        iI0i116.I00IoIO0lI(1);
/* 94 */                        iI0i116.I00IoO0();
/* 97 */                        II0lI0lO1 iI0lI0lO16 = iI0i116.I0110OiO;
/* 99 */                        OI0lOii0I oI0lOii0I5 = iI0lI0lO16.I00100o1O0lo;
/* 101 */                       if (oI0lOii0I5 == null) {
/* 105 */                           oI0lOii0I5 = new OI0lOii0I();
/* 108 */                           iI0lI0lO16.I00100o1O0lo = oI0lOii0I5;
                                }
/* 112 */                       II0lI0lO1.I000II(oI0lOii0I5, Boolean.FALSE);
/* 115 */                       return;
                            }
/* 115 */                   return;
                        default:
/* 14 */                    IoIlOo1o0IIl ioIlOo1o0IIl = (IoIlOo1o0IIl) obj2;
/* 16 */                    O110oIO0 o110oIO0 = (O110oIO0) obj;
                            synchronized (((HashMap) ioIlOo1o0IIl.I00iiO)) {
/* 29 */                        map = new HashMap((HashMap) ioIlOo1o0IIl.I00iiO);
                            }
/* 45 */                    for (Map.Entry entry : map.entrySet()) {
/* 57 */                        Executor executor = (Executor) entry.getValue();
/* 62 */                        Io11iII11ll io11iII11ll = new Io11iII11ll(6);
/* 65 */                        io11iII11ll.I00iiI = entry;
/* 67 */                        io11iII11ll.I00iiO = o110oIO0;
/* 69 */                        VarHandle.storeStoreFence();
/* 72 */                        executor.execute(io11iII11ll);
                            }
/* 76 */                    return;
                    }
                }
            }
