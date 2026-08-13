            package p000;

            import android.graphics.Bitmap;
            import android.graphics.drawable.Drawable;
            import android.hardware.camera2.CameraManager;
            import com.google.ai.edge.gallery.customtasks.agentchat.AgentTools;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            
/* 12 */    public final class I00oI0i extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final Object I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I00oI0i(Ii1olII1lO1 ii1olII1lO1, IOoil1iiIilo iOoil1iiIilo, IOi10loi iOi10loi) {
/* 10 */            super(2, iOoil1iiIilo);
/* 3 */             this.I00iOIl = 14;
/* 5 */             this.I00iiO = ii1olII1lO1;
/* 7 */             this.I00iio = iOi10loi;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iio;
                    switch (i) {
                        case 0:
/* 386 */                   return new I00oI0i((OI0lOIiOIOOo) this.I00iiO, (IoI1l00l) obj2, iOoil1iiIilo, 0);
                        case 1:
/* 373 */                   return new I00oI0i((OI0lOIiOIOOo) this.I00iiO, (IoI1lIo00o0i) obj2, iOoil1iiIilo, 1);
                        case 2:
/* 358 */                   I00oI0i i00oI0i = new I00oI0i((Ii10ioolOI) obj2, iOoil1iiIilo, 2);
/* 361 */                   i00oI0i.I00iiO = obj;
/* 363 */                   return i00oI0i;
                        case 3:
/* 349 */                   return new I00oI0i((AgentTools) this.I00iiO, (I0i1Io) obj2, iOoil1iiIilo, 3);
                        case 4:
/* 336 */                   return new I00oI0i((I0l10OiIOil) this.I00iiO, (IilIoiI1Oo01) obj2, iOoil1iiIilo, 4);
                        case 5:
/* 323 */                   return new I00oI0i((I0oOiiOi0l) this.I00iiO, (IoloOio0I) obj2, iOoil1iiIilo, 5);
                        case 6:
/* 308 */                   I00oI0i i00oI0i2 = new I00oI0i((I0olOi00O) obj2, iOoil1iiIilo, 6);
/* 311 */                   i00oI0i2.I00iiO = obj;
/* 313 */                   return i00oI0i2;
                        case 7:
/* 297 */                   I00oI0i i00oI0i3 = new I00oI0i((OO1lio) obj2, iOoil1iiIilo, 7);
/* 300 */                   i00oI0i3.I00iiO = obj;
/* 302 */                   return i00oI0i3;
                        case 8:
/* 288 */                   return new I00oI0i((I1Oo1iio0) obj2, iOoil1iiIilo, 8);
                        case 9:
/* 276 */                   I00oI0i i00oI0i4 = new I00oI0i((I1ool0o) obj2, iOoil1iiIilo, 9);
/* 279 */                   i00oI0i4.I00iiO = obj;
/* 281 */                   return i00oI0i4;
                        case 10:
/* 266 */                   return new I00oI0i((AtomicBoolean) this.I00iiO, (IllOOo00lI) obj2, iOoil1iiIilo, 10);
                        case 11:
/* 252 */                   return new I00oI0i((II1o0111IO0) this.I00iiO, (Bitmap) obj2, iOoil1iiIilo, 11);
                        case 12:
/* 238 */                   return new I00oI0i((III010oO1l) this.I00iiO, (OOo0IO) obj2, iOoil1iiIilo, 12);
                        case 13:
/* 224 */                   return new I00oI0i((III0OOl1) this.I00iiO, (I0iI0O1IoIoI) obj2, iOoil1iiIilo, 13);
                        case 14:
/* 210 */                   return new I00oI0i((Ii1olII1lO1) this.I00iiO, iOoil1iiIilo, (IOi10loi) obj2);
                        case 15:
/* 196 */                   I00oI0i i00oI0i5 = new I00oI0i((o01l1ioOo0) obj2, iOoil1iiIilo, 15);
/* 199 */                   i00oI0i5.I00iiO = obj;
/* 201 */                   return i00oI0i5;
                        case 16:
/* 184 */                   I00oI0i i00oI0i6 = new I00oI0i((IIioo1) obj2, iOoil1iiIilo, 16);
/* 187 */                   i00oI0i6.I00iiO = obj;
/* 189 */                   return i00oI0i6;
                        case 17:
/* 172 */                   I00oI0i i00oI0i7 = new I00oI0i((IIl01i0I) obj2, iOoil1iiIilo, 17);
/* 175 */                   i00oI0i7.I00iiO = obj;
/* 177 */                   return i00oI0i7;
                        case PoseLandmark.RIGHT_PINKY:
/* 162 */                   return new I00oI0i((Oi10ili0) this.I00iiO, (IO01o11o0lI0) obj2, iOoil1iiIilo, 18);
                        case PoseLandmark.LEFT_INDEX:
/* 148 */                   return new I00oI0i((List) this.I00iiO, (IO01oI0l101o) obj2, iOoil1iiIilo, 19);
                        case PoseLandmark.RIGHT_INDEX:
/* 132 */                   I00oI0i i00oI0i8 = new I00oI0i((IO101i) obj2, iOoil1iiIilo, 20);
/* 135 */                   i00oI0i8.I00iiO = obj;
/* 137 */                   return i00oI0i8;
                        case PoseLandmark.LEFT_THUMB:
/* 120 */                   I00oI0i i00oI0i9 = new I00oI0i((IO10O00o) obj2, iOoil1iiIilo, 21);
/* 123 */                   i00oI0i9.I00iiO = obj;
/* 125 */                   return i00oI0i9;
                        case PoseLandmark.RIGHT_THUMB:
/* 110 */                   return new I00oI0i((List) this.I00iiO, (O0o0I1i0O) obj2, iOoil1iiIilo, 22);
                        case PoseLandmark.LEFT_HIP:
/* 96 */                    return new I00oI0i((IOl0OoOIliI1) obj2, iOoil1iiIilo, 23);
                        case PoseLandmark.RIGHT_HIP:
/* 86 */                    return new I00oI0i((IOl0iiI) this.I00iiO, (Runnable) obj2, iOoil1iiIilo, 24);
                        case PoseLandmark.LEFT_KNEE:
/* 72 */                    return new I00oI0i((Oo0IOoOi01) this.I00iiO, (III0Ii) obj2, iOoil1iiIilo, 25);
                        case PoseLandmark.RIGHT_KNEE:
/* 58 */                    return new I00oI0i((OO1io0l0) this.I00iiO, (Oo0IOoOi01) obj2, iOoil1iiIilo, 26);
                        case 27:
/* 44 */                    return new I00oI0i((O010OIi) this.I00iiO, (Ii0i1Iolo) obj2, iOoil1iiIilo, 27);
                        case PoseLandmark.RIGHT_ANKLE:
/* 30 */                    return new I00oI0i((III0Ii) this.I00iiO, (OOo0IO) obj2, iOoil1iiIilo, 28);
                        default:
/* 14 */                    I00oI0i i00oI0i10 = new I00oI0i((List) obj2, iOoil1iiIilo, 29);
/* 17 */                    i00oI0i10.I00iiO = obj;
/* 19 */                    return i00oI0i10;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 456 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 441 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 426 */                   return ((I00oI0i) create((O00OoO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 411 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 396 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 380 */                   ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 383 */                   return Ii0111o.I00iOIl;
                        case 6:
/* 364 */                   ((I00oI0i) create((IoloiIIo0l) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 367 */                   return Ii0111o.I00iOIl;
                        case 7:
/* 349 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 8:
/* 334 */                   return ((I00oI0i) create((IoiOl011o) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 9:
/* 319 */                   return ((I00oI0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 10:
/* 304 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 11:
/* 289 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 12:
/* 274 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 13:
/* 259 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 14:
/* 244 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 15:
/* 229 */                   return ((I00oI0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 16:
/* 214 */                   return ((I00oI0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 17:
/* 199 */                   return ((I00oI0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_PINKY:
/* 184 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_INDEX:
/* 169 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_INDEX:
/* 154 */                   return ((I00oI0i) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_THUMB:
/* 139 */                   return ((I00oI0i) create((IlOil1iooOO0) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_THUMB:
/* 124 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_HIP:
/* 109 */                   return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_HIP:
/* 94 */                    return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.LEFT_KNEE:
/* 79 */                    return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case PoseLandmark.RIGHT_KNEE:
/* 64 */                    return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 27:
/* 48 */                    ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
/* 51 */                    return Ii0111o.I00iOIl;
                        case PoseLandmark.RIGHT_ANKLE:
/* 33 */                    return ((I00oI0i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((I00oI0i) create((Ii1Ii1l0OI) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:160:0x02e6, code lost:
                
                    if (r14.I001l0I00(r13) != r2) goto L162;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:442:0x08c0, code lost:
                
                    if (r14.invoke(r1, r13) == r2) goto L443;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(500, r13) != r0) goto L55;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:353:0x06f0  */
                /* JADX WARN: Removed duplicated region for block: B:361:0x0722  */
                /* JADX WARN: Removed duplicated region for block: B:367:0x073b  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:30:0x007c, B:55:0x00d4, B:48:0x00bc, B:51:0x00c5, B:35:0x0089, B:36:0x008d, B:37:0x0095, B:44:0x00ac, B:46:0x00b5), top: B:466:0x0072 }] */
                /* JADX WARN: Type inference failed for: r9v0, types: [IOoil1iiIilo] */
                /* JADX WARN: Type inference failed for: r9v16, types: [OIoOo11] */
                /* JADX WARN: Type inference failed for: r9v64 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:356:0x0711 -> B:358:0x0715). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d0 -> B:55:0x00d4). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Ii0110 ii0110;
                    O0O01O0o o0O01O0oI00000oIO;
                    ArrayList arrayList;
                    OOo0l0ii10l oOo0l0ii10l;
/* 3 */             int i = 26;
/* 5 */             int i2 = 5;
/* 10 */            int i3 = 2;
/* 11 */            boolean zBooleanValue = false;
/* 11 */            zBooleanValue = false;
/* 12 */            int i4 = 1;
/* 12 */            boolean z = true;
/* 12 */            boolean z2 = true;
                    switch (this.I00iOIl) {
                        case 0:
/* 2290 */                  Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 2292 */                  int i5 = this.I00iiI;
/* 2294 */                  if (i5 == 0) {
/* 2308 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2313 */                      OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) this.I00iiO;
/* 2317 */                      IoI1l00l ioI1l00l = (IoI1l00l) this.I00iio;
/* 2319 */                      this.I00iiI = 1;
/* 2325 */                      if (oI0lOIiOIOOo.I00000oIO(ioI1l00l, this) == ii0111o) {
/* 2327 */                          return ii0111o;
                                }
                            } else {
/* 2296 */                      if (i5 != 1) {
/* 2304 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2298 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2329 */                  return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 2248 */                  Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 2250 */                  int i6 = this.I00iiI;
/* 2252 */                  if (i6 == 0) {
/* 2266 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2271 */                      OI0lOIiOIOOo oI0lOIiOIOOo2 = (OI0lOIiOIOOo) this.I00iiO;
/* 2275 */                      IoI1lIo00o0i ioI1lIo00o0i = (IoI1lIo00o0i) this.I00iio;
/* 2277 */                      this.I00iiI = 1;
/* 2283 */                      if (oI0lOIiOIOOo2.I00000oIO(ioI1lIo00o0i, this) == ii0111o2) {
/* 2285 */                          return ii0111o2;
                                }
                            } else {
/* 2254 */                      if (i6 != 1) {
/* 2262 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2256 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2287 */                  return OoiIlOl1iI.I00000oIO;
                        case 2:
/* 2181 */                  Ii10ioolOI ii10ioolOI = (Ii10ioolOI) this.I00iio;
/* 2185 */                  O00OoO o00OoO = (O00OoO) this.I00iiO;
/* 2187 */                  Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 2189 */                  int i7 = this.I00iiI;
/* 2191 */                  if (i7 == 0) {
/* 2211 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2216 */                      IOi10loi iOi10loi = (IOi10loi) ii10ioolOI.I0000Il00O;
/* 2218 */                      this.I00iiO = o00OoO;
/* 2220 */                      this.I00iiI = 1;
/* 2226 */                      if (iOi10loi.I0010o(this) != ii0111o3) {
                                }
/* 2243 */                      return ii0111o3;
                            }
/* 2193 */                  if (i7 != 1) {
/* 2195 */                      if (i7 == 2) {
/* 2197 */                          lIoii1l01l0i.I00000oOI(obj);
/* 2245 */                          return OoiIlOl1iI.I00000oIO;
                                }
/* 2203 */                      I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 2207 */                  lIoii1l01l0i.I00000oOI(obj);
/* 2231 */                  IlliIl1l11O illiIl1l11O = (IlliIl1l11O) ii10ioolOI.I0000O;
/* 2233 */                  this.I00iiO = o00OoO;
/* 2235 */                  this.I00iiI = 2;
                            break;
                        case 3:
/* 2133 */                  Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 2135 */                  int i8 = this.I00iiI;
/* 2137 */                  if (i8 == 0) {
/* 2151 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1 */                         IO1010 io1010 = ((AgentTools) this.I00iiO)._actionChannel;
/* 2164 */                      I0i1Io i0i1Io = (I0i1Io) this.I00iio;
/* 2166 */                      this.I00iiI = 1;
/* 2172 */                      if (io1010.I00000oOI(this, i0i1Io) == ii0111o4) {
/* 2174 */                          return ii0111o4;
                                }
                            } else {
/* 2139 */                      if (i8 != 1) {
/* 2147 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2141 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2176 */                  return OoiIlOl1iI.I00000oIO;
                        case 4:
/* 2035 */                  I0l10OiIOil i0l10OiIOil = (I0l10OiIOil) this.I00iiO;
/* 2037 */                  Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 2039 */                  int i9 = this.I00iiI;
/* 2041 */                  if (i9 == 0) {
/* 2057 */                      lIoii1l01l0i.I00000oOI(obj);
/* 2064 */                      long j = ((IilIoiI1Oo01) this.I00iio).I00000oIO;
/* 2066 */                      Boolean bool = i0l10OiIOil.I010i10l;
/* 2068 */                      if (bool != null) {
/* 2088 */                          zBooleanValue = bool.booleanValue();
                                } else if (il0lI1i1olii.I000O01llI0(i0l10OiIOil).I00oo1iO0ll == O0iOOoiioO.I00iiI && i0l10OiIOil.I00o101lO == OIilII.I00iiI) {
/* 2086 */                          zBooleanValue = true;
                                }
/* 2101 */                      long jI000II = zBooleanValue ? OooIOilolOo.I000II(-1.0f, j) : OooIOilolOo.I000II(1.0f, j);
/* 2116 */                      float fI0000O = i0l10OiIOil.I00o101lO == OIilII.I00iOIl ? OooIOilolOo.I0000O(jI000II) : OooIOilolOo.I0000Il00O(jI000II);
/* 2120 */                      this.I00iiI = 1;
/* 2126 */                      if (i0l10OiIOil.I011lOIoo0l(fI0000O, this) == ii0111o5) {
/* 2128 */                          return ii0111o5;
                                }
                            } else {
/* 2043 */                      if (i9 != 1 && i9 != 2) {
/* 2053 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 2047 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 2130 */                  return OoiIlOl1iI.I00000oIO;
                        case 5:
/* 1948 */                  Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 1950 */                  int i10 = this.I00iiI;
/* 1952 */                  if (i10 == 0) {
/* 1975 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1982 */                      I01OoIoio00O i01OoIoio00O = new I01OoIoio00O(24);
/* 1985 */                      this.I00iiI = 1;
/* 1991 */                      if (l1i0lii.I00000oOI(i01OoIoio00O, this) != ii0111o6) {
                                }
/* 1993 */                      return ii0111o6;
                            }
/* 1954 */                  if (i10 != 1) {
/* 1956 */                      if (i10 != 2) {
/* 1960 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1964 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1967 */                      IOOlIIilOl0.I0000Il00O();
/* 13 */                        return null;
                            }
/* 1971 */                  lIoii1l01l0i.I00000oOI(obj);
/* 1997 */                  I0oOiiOi0l i0oOiiOi0l = (I0oOiiOi0l) this.I00iiO;
/* 1999 */                  Oiolio oiolioI00000oOI = i0oOiiOi0l.I0000O;
/* 2001 */                  if (oiolioI00000oOI == null) {
/* 2006 */                      oiolioI00000oOI = Oiolio0iO1.I00000oOI(0, 2, IIII0i.I00iiO);
/* 2010 */                      i0oOiiOi0l.I0000O = oiolioI00000oOI;
                            }
/* 2016 */                  IoloOio0I ioloOio0I = (IoloOio0I) this.I00iio;
/* 2018 */                  I0oOII1l i0oOII1l = new I0oOII1l(zBooleanValue ? 1 : 0);
/* 2021 */                  i0oOII1l.I00iiI = ioloOio0I;
/* 2023 */                  VarHandle.storeStoreFence();
/* 2026 */                  this.I00iiI = 2;
/* 2028 */                  Oiolio.I000lI(oiolioI00000oOI, i0oOII1l, this);
/* 1993 */                  return ii0111o6;
                        case 6:
/* 1855 */                  Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 1857 */                  int i11 = this.I00iiI;
/* 1859 */                  if (i11 == 0) {
/* 1877 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1882 */                      IoloiIIo0l ioloiIIo0l = (IoloiIIo0l) this.I00iiO;
/* 1886 */                      I0olOi00O i0olOi00O = (I0olOi00O) this.I00iio;
/* 1888 */                      this.I00iiO = ioloiIIo0l;
/* 1890 */                      this.I00iiI = 1;
/* 1898 */                      IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(this));
/* 1901 */                      iIoOoIol0Io0.I00111O();
/* 1904 */                      Oo0Oo0 oo0Oo0 = i0olOi00O.I00iiI;
/* 1906 */                      OO1OOi oO1OOi = oo0Oo0.I00000oIO;
/* 1908 */                      oO1OOi.I00000oIO();
/* 1918 */                      oo0Oo0.I00000oOI.set(new Oo0i01111o(oo0Oo0, oO1OOi));
/* 1923 */                      I01i01OoI i01i01OoI = new I01i01OoI(i3);
/* 1926 */                      i01i01OoI.I00iiI = ioloiIIo0l;
/* 1928 */                      i01i01OoI.I00iiO = i0olOi00O;
/* 1930 */                      VarHandle.storeStoreFence();
/* 1933 */                      iIoOoIol0Io0.I001IO000(i01i01OoI);
/* 1940 */                      if (iIoOoIol0Io0.I0010I0i() == ii0111o7) {
/* 1942 */                          return ii0111o7;
                                }
                            } else {
/* 1861 */                      if (i11 != 1) {
/* 1865 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1873 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1944 */                  IOOlIIilOl0.I0000Il00O();
/* 13 */                    return null;
                        case 7:
/* 1741 */                  Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 1743 */                  int i12 = this.I00iiI;
/* 1745 */                  if (i12 == 0) {
/* 1763 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1768 */                      ii0110 = (Ii0110) this.I00iiO;
/* 1775 */                      if (il001oo1.I0000O(ii0110)) {
                                }
                            } else {
/* 1747 */                      if (i12 != 1) {
/* 1759 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1751 */                      ii0110 = (Ii0110) this.I00iiO;
/* 1753 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1816 */                      OO1lio oO1lio = (OO1lio) this.I00iio;
/* 1818 */                      int[] iArr = oO1lio.I00ooiO1I;
/* 1824 */                      if (oO1lio.isAttachedToWindow()) {
/* 1827 */                          int i13 = iArr[0];
/* 1829 */                          int i14 = iArr[1];
/* 1833 */                          oO1lio.I00lli11.getLocationOnScreen(iArr);
/* 1838 */                          if (i13 != iArr[0] || i14 != iArr[1]) {
/* 1844 */                              oO1lio.I00100o1O0lo();
                                    }
                                }
/* 1775 */                      if (il001oo1.I0000O(ii0110)) {
/* 1779 */                          I01OoIoio00O i01OoIoio00O2 = new I01OoIoio00O(26);
/* 1782 */                          this.I00iiO = ii0110;
/* 1784 */                          this.I00iiI = 1;
/* 1796 */                          if (getContext().I00lli11(o0llIi.I00iio) != null) {
/* 1848 */                              OIiilo1Ool0o.I00000oIO();
/* 13 */                                return null;
                                    }
/* 1810 */                          if (l1i0lii.I00000oIO(getContext()).I00000oIO(this, i01OoIoio00O2) == ii0111o8) {
/* 1812 */                              return ii0111o8;
                                    }
/* 1816 */                          OO1lio oO1lio2 = (OO1lio) this.I00iio;
/* 1818 */                          int[] iArr2 = oO1lio2.I00ooiO1I;
/* 1824 */                          if (oO1lio2.isAttachedToWindow()) {
                                    }
/* 1775 */                          if (il001oo1.I0000O(ii0110)) {
/* 1852 */                              return OoiIlOl1iI.I00000oIO;
                                    }
                                }
                            }
                            break;
                        case 8:
/* 1520 */                  I1Oo1iio0 i1Oo1iio0 = (I1Oo1iio0) this.I00iio;
/* 1522 */                  Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 1524 */                  int i15 = this.I00iiI;
/* 1526 */                  if (i15 == 0) {
/* 1547 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1556 */                      OOllOII oOllOII = (OOllOII) i1Oo1iio0.I00oI0i.getValue();
/* 1564 */                      IoiOl011o ioiOl011o = (IoiOl011o) i1Oo1iio0.I00o101lO.getValue();
/* 1566 */                      IoiOiIIiO0Il ioiOiIIiO0IlI00000oIO = IoiOl011o.I00000oIO(ioiOl011o);
/* 1572 */                      Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 1575 */                      oi00IilOloo0.I00iOIl = i1Oo1iio0;
/* 1577 */                      VarHandle.storeStoreFence();
/* 1580 */                      ioiOiIIiO0IlI00000oIO.I0000O = oi00IilOloo0;
/* 1582 */                      ioiOiIIiO0IlI00000oIO.I000oI1ioi = null;
/* 1584 */                      ioiOiIIiO0IlI00000oIO.I00100l0 = null;
/* 1586 */                      ioiOiIIiO0IlI00000oIO.I00100o1O0lo = null;
/* 1588 */                      IiIi1o00o iiIi1o00o = ioiOl011o.I001iOo1i0O;
/* 1592 */                      if (iiIi1o00o.I00000oIO == null) {
/* 1596 */                          I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(i3);
/* 1599 */                          i0IIiO0iI.I00iiI = i1Oo1iio0;
/* 1601 */                          VarHandle.storeStoreFence();
/* 1604 */                          ioiOiIIiO0IlI00000oIO.I000lI = i0IIiO0iI;
/* 1606 */                          ioiOiIIiO0IlI00000oIO.I000oI1ioi = null;
/* 1608 */                          ioiOiIIiO0IlI00000oIO.I00100l0 = null;
/* 1610 */                          ioiOiIIiO0IlI00000oIO.I00100o1O0lo = null;
                                }
/* 1614 */                      if (iiIi1o00o.I00000oOI == null) {
/* 1616 */                          IOoOOI1ii iOoOOI1ii = i1Oo1iio0.I00lli11;
/* 1618 */                          int i16 = Oolll10.I00000oIO;
/* 1643 */                          ioiOiIIiO0IlI00000oIO.I000o00OoI0I = O0000Ioio00.I0000O(iOoOOI1ii, IOoOIiOl1llI.I00000oOI) ? true : O0000Ioio00.I0000O(iOoOOI1ii, IOoOIiOl1llI.I0000oI00) ? OiO0llO0IO.I00iiI : OiO0llO0IO.I00iOIl;
                                }
/* 1649 */                      if (iiIi1o00o.I0000O != OO1o11.I00iOIl) {
/* 1653 */                          ioiOiIIiO0IlI00000oIO.I0000oI00 = OO1o11.I00iiI;
                                }
/* 1655 */                      IoiOl011o ioiOl011oI00000oIO = ioiOiIIiO0IlI00000oIO.I00000oIO();
/* 1659 */                      this.I00iiO = i1Oo1iio0;
/* 1661 */                      this.I00iiI = 1;
/* 1663 */                      oOllOII.getClass();
/* 1671 */                      obj = il001oo1.I0000Il00O(new OO11OilO(ioiOl011oI00000oIO, oOllOII, I000iOII, i2), this);
/* 1675 */                      if (obj == ii0111o9) {
/* 1677 */                          return ii0111o9;
                                }
                            } else {
/* 1528 */                      if (i15 != 1) {
/* 1542 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1533 */                      i1Oo1iio0 = (I1Oo1iio0) this.I00iiO;
/* 1535 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1679 */                  IoiOl01IilO ioiOl01IilO = (IoiOl01IilO) obj;
/* 1681 */                  i1Oo1iio0.getClass();
/* 1686 */                  if (ioiOl01IilO instanceof OliOlO1o1) {
/* 1690 */                      OliOlO1o1 oliOlO1o1 = (OliOlO1o1) ioiOl01IilO;
/* 1694 */                      OIoOo11 oIoOo11I000iOII = i1Oo1iio0.I000iOII(oliOlO1o1.I00000oIO);
/* 1698 */                      I1Oo0l00o i1Oo0l00o = new I1Oo0l00o();
/* 1701 */                      i1Oo0l00o.I00000oIO = oIoOo11I000iOII;
/* 1703 */                      i1Oo0l00o.I00000oOI = oliOlO1o1;
/* 1705 */                      VarHandle.storeStoreFence();
/* 1740 */                      return i1Oo0l00o;
                            }
/* 1711 */                  if (!(ioiOl01IilO instanceof Il0oiioiOlI)) {
/* 1737 */                      I000II.I00000oIO();
/* 13 */                        return null;
                            }
/* 1715 */                  Il0oiioiOlI il0oiioiOlI = (Il0oiioiOlI) ioiOl01IilO;
/* 1717 */                  Drawable drawable = il0oiioiOlI.I00000oIO;
/* 1721 */                  I000iOII = drawable != null ? i1Oo1iio0.I000iOII(drawable) : 0;
/* 1725 */                  I1Olol0 i1Olol0 = new I1Olol0();
/* 1728 */                  i1Olol0.I00000oIO = I000iOII;
/* 1730 */                  i1Olol0.I00000oOI = il0oiioiOlI;
/* 1732 */                  VarHandle.storeStoreFence();
/* 1735 */                  return i1Olol0;
                        case 9:
/* 1371 */                  Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 1373 */                  int i17 = this.I00iiI;
/* 1375 */                  if (i17 == 0) {
/* 1391 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1396 */                      OOIoOo0O oOIoOo0O = (OOIoOo0O) this.I00iiO;
/* 1402 */                      I1ool0o i1ool0o = (I1ool0o) this.I00iio;
/* 1404 */                      I1oI11I i1oI11I = new I1oI11I();
/* 1407 */                      i1oI11I.I00000oIO = i1ool0o;
/* 1409 */                      i1oI11I.I00000oOI = oOIoOo0O;
/* 1411 */                      VarHandle.storeStoreFence();
/* 1414 */                      I1oolIoOllO i1oolIoOllO = i1ool0o.I00000oIO;
                                synchronized (i1oolIoOllO.I0000Il00O) {
                                    try {
/* 1425 */                              if (i1oolIoOllO.I0000O.add(i1oI11I)) {
/* 1433 */                                  if (i1oolIoOllO.I0000O.size() == 1) {
/* 1439 */                                      i1oolIoOllO.I0000oI00 = i1oolIoOllO.I00000oOI();
/* 1441 */                                      IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 1445 */                                      int i18 = IOo0ilo.I00000oIO;
/* 1449 */                                      Objects.toString(i1oolIoOllO.I0000oI00);
/* 1452 */                                      iIi0oIlI000II.getClass();
/* 1455 */                                      IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 1459 */                                      int i19 = III11I000O.I00000oIO;
/* 1461 */                                      iIi0oIlI000II2.getClass();
/* 1472 */                                      i1oolIoOllO.I00000oOI.registerReceiver(i1oolIoOllO.I0001Ioi1lo, i1oolIoOllO.I00000oIO());
                                            }
/* 1481 */                                  i1oI11I.I00000oIO(i1oolIoOllO.I0000oI00);
                                        }
                                    } catch (Throwable th) {
/* 1517 */                              throw th;
                                    }
                                }
/* 1487 */                      I1ool0o i1ool0o2 = (I1ool0o) this.I00iio;
/* 1493 */                      I01ii1IIl i01ii1IIl = new I01ii1IIl(14);
/* 1496 */                      i01ii1IIl.I00iiI = i1ool0o2;
/* 1498 */                      i01ii1IIl.I00iiO = i1oI11I;
/* 1500 */                      VarHandle.storeStoreFence();
/* 1503 */                      this.I00iiI = 1;
/* 1509 */                      if (lIIl0IOilo0.I00000oIO(oOIoOo0O, i01ii1IIl, this) == ii0111o10) {
/* 1511 */                          return ii0111o10;
                                }
                            } else {
/* 1377 */                      if (i17 != 1) {
/* 1386 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1379 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1513 */                  return OoiIlOl1iI.I00000oIO;
                        case 10:
/* 1318 */                  Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 1320 */                  int i20 = this.I00iiI;
/* 1322 */                  if (i20 == 0) {
/* 1336 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1339 */                      this.I00iiI = 1;
/* 1347 */                      if (il0l1o1l.I00000oOI(1500L, this) == ii0111o11) {
/* 1349 */                          return ii0111o11;
                                }
                            } else {
/* 1324 */                      if (i20 != 1) {
/* 1332 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1326 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1353 */                  AtomicBoolean atomicBoolean = (AtomicBoolean) this.I00iiO;
/* 1357 */                  IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 1363 */                  if (atomicBoolean.compareAndSet(false, true)) {
/* 1365 */                      illOOo00lI.invoke();
                            }
/* 1368 */                  return OoiIlOl1iI.I00000oIO;
                        case 11:
/* 1249 */                  Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 1251 */                  int i21 = this.I00iiI;
                            try {
/* 1253 */                      if (i21 == 0) {
/* 1270 */                          lIoii1l01l0i.I00000oOI(obj);
/* 1275 */                          II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) this.I00iiO;
/* 1279 */                          Bitmap bitmap = (Bitmap) this.I00iio;
/* 1281 */                          this.I00iiI = 1;
/* 1287 */                          if (iI1o0111IO0.I00100o1O0lo(bitmap, this) == ii0111o12) {
/* 1289 */                              return ii0111o12;
                                    }
                                } else {
/* 1255 */                          if (i21 != 1) {
/* 1266 */                              I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 1257 */                          lIoii1l01l0i.I00000oOI(obj);
                                }
                            } finally {
                                try {
/* 1306 */                          return OoiIlOl1iI.I00000oIO;
                                } finally {
                                }
                            }
/* 1306 */                  return OoiIlOl1iI.I00000oIO;
                        case 12:
/* 1195 */                  Ii0111o ii0111o13 = Ii0111o.I00iOIl;
/* 1197 */                  int i22 = this.I00iiI;
/* 1199 */                  if (i22 == 0) {
/* 1213 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1218 */                      III010oO1l iII010oO1l = (III010oO1l) this.I00iiO;
/* 1222 */                      OOo0IO oOo0IO = (OOo0IO) this.I00iio;
/* 1228 */                      I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(12);
/* 1231 */                      i0OIOO00l0O.I00iiI = oOo0IO;
/* 1233 */                      VarHandle.storeStoreFence();
/* 1236 */                      this.I00iiI = 1;
/* 1242 */                      if (iOi10ioilO0.I00000oIO(iII010oO1l, i0OIOO00l0O, this) == ii0111o13) {
/* 1244 */                          return ii0111o13;
                                }
                            } else {
/* 1201 */                      if (i22 != 1) {
/* 1209 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1203 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1246 */                  return OoiIlOl1iI.I00000oIO;
                        case 13:
/* 1153 */                  Ii0111o ii0111o14 = Ii0111o.I00iOIl;
/* 1155 */                  int i23 = this.I00iiI;
/* 1157 */                  if (i23 == 0) {
/* 1171 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1176 */                      III0OOl1 iII0OOl1 = (III0OOl1) this.I00iiO;
/* 1180 */                      I0iI0O1IoIoI i0iI0O1IoIoI = (I0iI0O1IoIoI) this.I00iio;
/* 1182 */                      this.I00iiI = 1;
/* 1188 */                      if (iOi10ioilO0.I00000oIO(iII0OOl1, i0iI0O1IoIoI, this) == ii0111o14) {
/* 1190 */                          return ii0111o14;
                                }
                            } else {
/* 1159 */                      if (i23 != 1) {
/* 1167 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1161 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1192 */                  return OoiIlOl1iI.I00000oIO;
                        case 14:
/* 1075 */                  Ii0111o ii0111o15 = Ii0111o.I00iOIl;
/* 1077 */                  int i24 = this.I00iiI;
/* 1079 */                  if (i24 == 0) {
/* 1093 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1100 */                      IoIlIolo10o ioIlIolo10oI00iOIl = ((Ii1olII1lO1) this.I00iiO).I00iOIl();
/* 1108 */                      O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(IOO01l.class);
                                try {
/* 1112 */                          o0O01O0oI00000oIO = OOoOl0i.I00000oIO(IOO01l.class);
                                } catch (Throwable unused) {
/* 1117 */                          o0O01O0oI00000oIO = null;
                                }
/* 1120 */                      OoOO010 ooOO010 = new OoOO010(o0IOli0o0I00000oOI, o0O01O0oI00000oIO);
/* 1123 */                      this.I00iiI = 1;
/* 1125 */                      obj = ioIlIolo10oI00iOIl.I00000oOI(ooOO010, this);
/* 1129 */                      if (obj == ii0111o15) {
/* 1131 */                          return ii0111o15;
                                }
                            } else {
/* 1081 */                      if (i24 != 1) {
/* 1089 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1083 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1133 */                  if (obj != null) {
/* 1141 */                      ((IOi10loi) this.I00iio).I00O10llo((IOO01l) obj);
/* 1144 */                      return OoiIlOl1iI.I00000oIO;
                            }
/* 1149 */                  IOOlIIilOl0.I000II("null cannot be cast to non-null type io.ktor.client.plugins.sse.ClientSSESession");
/* 13 */                    return null;
                        case 15:
/* 991 */                   o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) this.I00iio;
/* 993 */                   Ii0111o ii0111o16 = Ii0111o.I00iOIl;
/* 995 */                   int i25 = this.I00iiI;
/* 997 */                   if (i25 == 0) {
/* 1011 */                      lIoii1l01l0i.I00000oOI(obj);
/* 1016 */                      OOIoOo0O oOIoOo0O2 = (OOIoOo0O) this.I00iiO;
/* 1020 */                      IIilI0OO iIilI0OO = new IIilI0OO(oOIoOo0O2);
/* 1031 */                      CameraManager cameraManager = (CameraManager) ((OOiO01IO) o01l1iooo0.I00iOIl).get();
/* 1045 */                      cameraManager.registerAvailabilityCallback((Executor) ((Oo10IliO00O) o01l1iooo0.I00iiI).I000O01llI0.getValue(), iIilI0OO);
/* 1052 */                      I01ii1IIl i01ii1IIl2 = new I01ii1IIl(25);
/* 1055 */                      i01ii1IIl2.I00iiI = cameraManager;
/* 1057 */                      i01ii1IIl2.I00iiO = iIilI0OO;
/* 1059 */                      VarHandle.storeStoreFence();
/* 1062 */                      this.I00iiI = 1;
/* 1068 */                      if (lIIl0IOilo0.I00000oIO(oOIoOo0O2, i01ii1IIl2, this) == ii0111o16) {
/* 1070 */                          return ii0111o16;
                                }
                            } else {
/* 999 */                       if (i25 != 1) {
/* 1007 */                          I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 1001 */                      lIoii1l01l0i.I00000oOI(obj);
                            }
/* 1072 */                  return OoiIlOl1iI.I00000oIO;
                        case 16:
/* 923 */                   IIioo1 iIioo1 = (IIioo1) this.I00iio;
/* 925 */                   Ii0111o ii0111o17 = Ii0111o.I00iOIl;
/* 927 */                   int i26 = this.I00iiI;
/* 929 */                   if (i26 == 0) {
/* 943 */                       lIoii1l01l0i.I00000oOI(obj);
/* 948 */                       OOIoOo0O oOIoOo0O3 = (OOIoOo0O) this.I00iiO;
/* 952 */                       IIioliiI iIioliiI = new IIioliiI(oOIoOo0O3, iIioo1);
/* 961 */                       iIioo1.I00iiO.registerAvailabilityCallback(iIioo1.I00iOIl.I0000oI00, iIioliiI);
/* 966 */                       I01ii1IIl i01ii1IIl3 = new I01ii1IIl(i);
/* 969 */                       i01ii1IIl3.I00iiI = iIioo1;
/* 971 */                       i01ii1IIl3.I00iiO = iIioliiI;
/* 973 */                       VarHandle.storeStoreFence();
/* 976 */                       this.I00iiI = 1;
/* 982 */                       if (lIIl0IOilo0.I00000oIO(oOIoOo0O3, i01ii1IIl3, this) == ii0111o17) {
/* 984 */                           return ii0111o17;
                                }
                            } else {
/* 931 */                       if (i26 != 1) {
/* 939 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 933 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 986 */                   return OoiIlOl1iI.I00000oIO;
                        case 17:
/* 802 */                   Ii0111o ii0111o18 = Ii0111o.I00iOIl;
/* 804 */                   int i27 = this.I00iiI;
/* 806 */                   if (i27 == 0) {
/* 820 */                       lIoii1l01l0i.I00000oOI(obj);
/* 825 */                       OOIoOo0O oOIoOo0O4 = (OOIoOo0O) this.I00iiO;
/* 833 */                       IIioliiI iIioliiI2 = new IIioliiI((IIl01i0I) this.I00iio, oOIoOo0O4);
/* 846 */                       CameraManager cameraManager2 = (CameraManager) ((IIl01i0I) this.I00iio).I00000oIO.get();
/* 858 */                       cameraManager2.registerAvailabilityCallback(iIioliiI2, ((IIl01i0I) this.I00iio).I00000oOI.I00000oIO());
/* 863 */                       IIl01i0I iIl01i0I = (IIl01i0I) this.I00iio;
                                synchronized (iIl01i0I.I0001Ioi1lo) {
/* 868 */                           arrayList = iIl01i0I.I000II;
                                }
/* 873 */                       IIl01i0I iIl01i0I2 = (IIl01i0I) this.I00iio;
/* 875 */                       if (arrayList != null) {
/* 877 */                           IIl01i0I.I0000oI00(oOIoOo0O4, arrayList);
                                } else {
/* 881 */                           ArrayList arrayListI0000O = iIl01i0I2.I0000O();
/* 885 */                           if (arrayListI0000O != null) {
/* 887 */                               IIl01i0I.I0000oI00(oOIoOo0O4, arrayListI0000O);
                                    }
                                }
/* 894 */                       I01ii1IIl i01ii1IIl4 = new I01ii1IIl(27);
/* 897 */                       i01ii1IIl4.I00iiI = cameraManager2;
/* 899 */                       i01ii1IIl4.I00iiO = iIioliiI2;
/* 901 */                       VarHandle.storeStoreFence();
/* 904 */                       this.I00iiI = 1;
/* 910 */                       if (lIIl0IOilo0.I00000oIO(oOIoOo0O4, i01ii1IIl4, this) == ii0111o18) {
/* 912 */                           return ii0111o18;
                                }
                            } else {
/* 808 */                       if (i27 != 1) {
/* 816 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 810 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 914 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_PINKY:
/* 755 */                   Oi10ili0 oi10ili0 = (Oi10ili0) this.I00iiO;
/* 757 */                   Ii0111o ii0111o19 = Ii0111o.I00iOIl;
/* 759 */                   int i28 = this.I00iiI;
/* 761 */                   if (i28 == 0) {
/* 775 */                       lIoii1l01l0i.I00000oOI(obj);
/* 778 */                       IOi10loi iOi10loi2 = oi10ili0.I00iiO;
/* 780 */                       this.I00iiI = 1;
/* 786 */                       if (iOi10loi2.I001l0I00(this) == ii0111o19) {
/* 788 */                           return ii0111o19;
                                }
                            } else {
/* 763 */                       if (i28 != 1) {
/* 771 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 765 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 796 */                   ((IO01o11o0lI0) this.I00iio).I0001Ioi1lo.I00000oOI(oi10ili0);
/* 799 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_INDEX:
/* 664 */                   OoI00O0l ooI00O0l = ((IO01oI0l101o) this.I00iio).I0000Il00O;
/* 668 */                   Ii0111o ii0111o20 = Ii0111o.I00iOIl;
/* 670 */                   int i29 = this.I00iiI;
/* 673 */                   if (i29 == 0) {
/* 699 */                       lIoii1l01l0i.I00000oOI(obj);
/* 704 */                       List list = (List) this.I00iiO;
/* 708 */                       this.I00iiI = 1;
/* 714 */                       if (iOOlOiI.I00000oOI(list, this) != ii0111o20) {
                                }
/* 745 */                       return ii0111o20;
                            }
/* 675 */                   if (i29 == 1) {
/* 695 */                       lIoii1l01l0i.I00000oOI(obj);
                            } else if (i29 == 2) {
/* 691 */                       lIoii1l01l0i.I00000oOI(obj);
/* 9 */                         IOi10loi iOi10loiI0000Il00O = ooI00O0l.I0000Il00O(2, true, (6 & 4) == 0);
/* 737 */                       this.I00iiI = 3;
                                break;
                            } else {
/* 679 */                       if (i29 != 3) {
/* 687 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 681 */                       lIoii1l01l0i.I00000oOI(obj);
/* 747 */                       l11I11lO.I0000O(3, "CXCP");
/* 750 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 717 */                   l11I11lO.I0000O(3, "CXCP");
/* 9 */                     IOi10loi iOi10loiI0000Il00O2 = ooI00O0l.I0000Il00O(0, true, (6 & 4) == 0);
/* 724 */                   this.I00iiI = 2;
/* 730 */                   if (iOi10loiI0000Il00O2.I001l0I00(this) != ii0111o20) {
/* 9 */                         IOi10loi iOi10loiI0000Il00O3 = ooI00O0l.I0000Il00O(2, true, (6 & 4) == 0);
/* 737 */                       this.I00iiI = 3;
                            }
/* 745 */                   return ii0111o20;
                        case PoseLandmark.RIGHT_INDEX:
/* 618 */                   OOIoOo0O oOIoOo0O5 = (OOIoOo0O) this.I00iiO;
/* 620 */                   Ii0111o ii0111o21 = Ii0111o.I00iOIl;
/* 622 */                   int i30 = this.I00iiI;
/* 624 */                   if (i30 == 0) {
/* 638 */                       lIoii1l01l0i.I00000oOI(obj);
/* 643 */                       IO101i iO101i = (IO101i) this.I00iio;
/* 645 */                       this.I00iiO = null;
/* 647 */                       this.I00iiI = 1;
/* 653 */                       if (iO101i.I000II(oOIoOo0O5, this) == ii0111o21) {
/* 655 */                           return ii0111o21;
                                }
                            } else {
/* 626 */                       if (i30 != 1) {
/* 634 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 628 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 657 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_THUMB:
/* 574 */                   IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiO;
/* 576 */                   Ii0111o ii0111o22 = Ii0111o.I00iOIl;
/* 578 */                   int i31 = this.I00iiI;
/* 580 */                   if (i31 == 0) {
/* 594 */                       lIoii1l01l0i.I00000oOI(obj);
/* 599 */                       IO10O00o iO10O00o = (IO10O00o) this.I00iio;
/* 601 */                       this.I00iiO = null;
/* 603 */                       this.I00iiI = 1;
/* 609 */                       if (iO10O00o.I000iOII(ilOil1iooOO0, this) == ii0111o22) {
/* 611 */                           return ii0111o22;
                                }
                            } else {
/* 582 */                       if (i31 != 1) {
/* 590 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 584 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 613 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_THUMB:
/* 522 */                   Ii0111o ii0111o23 = Ii0111o.I00iOIl;
/* 524 */                   int i32 = this.I00iiI;
/* 526 */                   if (i32 == 0) {
/* 540 */                       lIoii1l01l0i.I00000oOI(obj);
/* 553 */                       if (!((List) this.I00iiO).isEmpty()) {
/* 557 */                           O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) this.I00iio;
/* 559 */                           this.I00iiI = 1;
/* 565 */                           if (i1Ioo11OIl.I00000oOI(o0o0I1i0O, this) == ii0111o23) {
/* 567 */                               return ii0111o23;
                                    }
                                }
                            } else {
/* 528 */                       if (i32 != 1) {
/* 536 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 530 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 569 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.LEFT_HIP:
/* 439 */                   IOl0OoOIliI1 iOl0OoOIliI1 = (IOl0OoOIliI1) this.I00iio;
/* 441 */                   Ii0111o ii0111o24 = Ii0111o.I00iOIl;
/* 443 */                   int i33 = this.I00iiI;
/* 445 */                   if (i33 == 0) {
/* 463 */                       lIoii1l01l0i.I00000oOI(obj);
/* 470 */                       if (iOl0OoOIliI1.I00100l0()) {
/* 474 */                           OOo0l0ii10l oOo0l0ii10l2 = new OOo0l0ii10l();
/* 477 */                           IlliIl1l11O illiIl1l11O2 = iOl0OoOIliI1.I0000O;
/* 491 */                           IlOioIoiI ilOioIoiII00000oOI = ilOli1oOI10l.I00000oOI(new IO101O0llII(iOl0OoOIliI1.I0000oI00, z2 ? 1 : 0), new II10i1i((Object) oOo0l0ii10l2, (IOoil1iiIilo) I000iOII, (int) (z ? 1 : 0)));
/* 495 */                           this.I00iiO = oOo0l0ii10l2;
/* 497 */                           this.I00iiI = 1;
/* 503 */                           if (illiIl1l11O2.invoke(ilOioIoiII00000oOI, this) == ii0111o24) {
/* 505 */                               return ii0111o24;
                                    }
/* 507 */                           oOo0l0ii10l = oOo0l0ii10l2;
                                }
/* 519 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 447 */                   if (i33 != 1) {
/* 459 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 451 */                   oOo0l0ii10l = (OOo0l0ii10l) this.I00iiO;
/* 453 */                   lIoii1l01l0i.I00000oOI(obj);
/* 510 */                   if (!oOo0l0ii10l.I00iOIl) {
/* 515 */                       I000II.I001IO000("You must collect the progress flow");
/* 13 */                        return null;
                            }
/* 519 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_HIP:
/* 371 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 375 */                   IOl0iiI iOl0iiI = (IOl0iiI) this.I00iiO;
/* 377 */                   Ii0111o ii0111o25 = Ii0111o.I00iOIl;
/* 379 */                   int i34 = this.I00iiI;
/* 381 */                   if (i34 == 0) {
/* 395 */                       lIoii1l01l0i.I00000oOI(obj);
/* 398 */                       IoI1IiioI ioI1IiioI = iOl0iiI.I0001Ioi1lo;
/* 400 */                       this.I00iiI = 1;
/* 405 */                       Object objI00000oOI = ioI1IiioI.I00000oOI(0.0f - ioI1IiioI.I00000oOI, this);
/* 409 */                       if (objI00000oOI != ii0111o25) {
/* 412 */                           objI00000oOI = ooiIlOl1iI;
                                }
/* 413 */                       if (objI00000oOI == ii0111o25) {
/* 415 */                           return ii0111o25;
                                }
                            } else {
/* 383 */                       if (i34 != 1) {
/* 391 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 385 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 425 */                   ((OIooliIO0) iOl0iiI.I0000Il00O.I00iiI).setValue(Boolean.FALSE);
/* 432 */                   ((Runnable) this.I00iio).run();
/* 435 */                   return ooiIlOl1iI;
                        case PoseLandmark.LEFT_KNEE:
/* 283 */                   Ii0111o ii0111o26 = Ii0111o.I00iOIl;
/* 285 */                   int i35 = this.I00iiI;
/* 287 */                   if (i35 == 0) {
/* 301 */                       lIoii1l01l0i.I00000oOI(obj);
/* 306 */                       Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) this.I00iiO;
/* 308 */                       OIOlOI oIOlOI = oo0IOoOi01.I00000oOI;
/* 314 */                       long j2 = oo0IOoOi01.I000l1().I00000oOI;
/* 316 */                       int i36 = Oo0lI00l.I0000Il00O;
/* 322 */                       int iI000o00OoI0I = oIOlOI.I000o00OoI0I((int) (j2 >> 32));
/* 326 */                       O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 334 */                       Oo0iil0o0oI oo0iil0o0oI = (o0oIlOolIO != null ? o0oIlOolIO.I0000O() : null).I00000oIO;
/* 350 */                       OOo0IO oOo0IOI0000Il00O = oo0iil0o0oI.I0000Il00O(lIiioliIlo.I0000Il00O(iI000o00OoI0I, 0, oo0iil0o0oI.I00000oIO.I00000oIO.I00iiI.length()));
/* 356 */                       III0Ii iII0Ii = (III0Ii) this.I00iio;
/* 358 */                       this.I00iiI = 1;
/* 364 */                       if (iII0Ii.I00000oIO(oOo0IOI0000Il00O, this) == ii0111o26) {
/* 366 */                           return ii0111o26;
                                }
                            } else {
/* 289 */                       if (i35 != 1) {
/* 297 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 291 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 368 */                   return OoiIlOl1iI.I00000oIO;
                        case PoseLandmark.RIGHT_KNEE:
/* 225 */                   Ii0111o ii0111o27 = Ii0111o.I00iOIl;
/* 227 */                   int i37 = this.I00iiI;
/* 229 */                   if (i37 == 0) {
/* 243 */                       lIoii1l01l0i.I00000oOI(obj);
/* 249 */                       OO1io0l0 oO1io0l0 = (OO1io0l0) this.I00iiO;
/* 253 */                       Oo0IOoOi01 oo0IOoOi012 = (Oo0IOoOi01) this.I00iio;
/* 257 */                       IOooiliO0l iOooiliO0l = new IOooiliO0l(i4);
/* 260 */                       iOooiliO0l.I00iiI = oo0IOoOi012;
/* 262 */                       VarHandle.storeStoreFence();
/* 265 */                       this.I00iiI = 1;
/* 276 */                       if (OloI0l1i1oO.I0000oI00(oO1io0l0, null, null, null, iOooiliO0l, this, 7) == ii0111o27) {
/* 278 */                           return ii0111o27;
                                }
                            } else {
/* 231 */                       if (i37 != 1) {
/* 239 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 233 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 280 */                   return OoiIlOl1iI.I00000oIO;
                        case 27:
/* 106 */                   Ii0i1Iolo ii0i1Iolo = (Ii0i1Iolo) this.I00iio;
/* 108 */                   Ii0111o ii0111o28 = Ii0111o.I00iOIl;
/* 110 */                   int i38 = this.I00iiI;
                            try {
/* 115 */                       if (i38 == 0) {
/* 155 */                           lIoii1l01l0i.I00000oOI(obj);
/* 160 */                           O010OIi o010OIi = (O010OIi) this.I00iiO;
/* 162 */                           if (o010OIi != null) {
/* 164 */                               this.I00iiI = 1;
/* 170 */                               if (l01oO1iOo.I0000Il00O(o010OIi, this) == ii0111o28) {
                                        }
/* 187 */                               return ii0111o28;
                                    }
                                } else if (i38 == 1) {
/* 151 */                           lIoii1l01l0i.I00000oOI(obj);
                                } else {
/* 119 */                           if (i38 == 2) {
/* 142 */                               lIoii1l01l0i.I00000oOI(obj);
/* 150 */                               throw new IOiIIo1l(5);
                                    }
/* 121 */                           if (i38 != 3) {
/* 123 */                               if (i38 != 4) {
/* 134 */                                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                    return null;
                                        }
/* 125 */                               lIoii1l01l0i.I00000oOI(obj);
/* 215 */                               ii0i1Iolo.I0000Il00O.I000O01llI0(1.0f);
/* 189 */                               this.I00iiI = 3;
/* 195 */                               if (il0l1o1l.I00000oOI(500L, this) == ii0111o28) {
/* 200 */                                   ii0i1Iolo.I0000Il00O.I000O01llI0(0.0f);
/* 203 */                                   this.I00iiI = 4;
                                            break;
                                        }
/* 187 */                               return ii0111o28;
                                    }
/* 138 */                           lIoii1l01l0i.I00000oOI(obj);
/* 200 */                           ii0i1Iolo.I0000Il00O.I000O01llI0(0.0f);
/* 203 */                           this.I00iiI = 4;
                                }
/* 175 */                       ii0i1Iolo.I0000Il00O.I000O01llI0(1.0f);
/* 180 */                       if (!ii0i1Iolo.I00000oIO) {
/* 182 */                           this.I00iiI = 2;
/* 184 */                           il0l1o1l.I00000oIO(this);
/* 187 */                           return ii0111o28;
                                }
/* 189 */                       this.I00iiI = 3;
/* 195 */                       if (il0l1o1l.I00000oOI(500L, this) == ii0111o28) {
                                }
/* 187 */                       return ii0111o28;
                            } catch (Throwable th2) {
/* 221 */                       ii0i1Iolo.I0000Il00O.I000O01llI0(0.0f);
/* 224 */                       throw th2;
                            }
                        case PoseLandmark.RIGHT_ANKLE:
/* 61 */                    Ii0111o ii0111o29 = Ii0111o.I00iOIl;
/* 63 */                    int i39 = this.I00iiI;
/* 65 */                    if (i39 == 0) {
/* 79 */                        lIoii1l01l0i.I00000oOI(obj);
/* 84 */                        III0Ii iII0Ii2 = (III0Ii) this.I00iiO;
/* 88 */                        OOo0IO oOo0IO2 = (OOo0IO) this.I00iio;
/* 90 */                        this.I00iiI = 1;
/* 96 */                        if (iII0Ii2.I00000oIO(oOo0IO2, this) == ii0111o29) {
/* 98 */                            return ii0111o29;
                                }
                            } else {
/* 67 */                        if (i39 != 1) {
/* 75 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 69 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 100 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 17 */                    Ii0111o ii0111o30 = Ii0111o.I00iOIl;
/* 19 */                    int i40 = this.I00iiI;
/* 21 */                    if (i40 == 0) {
/* 35 */                        lIoii1l01l0i.I00000oOI(obj);
/* 40 */                        Ii1Ii1l0OI ii1Ii1l0OI = (Ii1Ii1l0OI) this.I00iiO;
/* 42 */                        lOOlOoll loolooll = Ii11oI0lli1O.I00000oIO;
/* 46 */                        List list2 = (List) this.I00iio;
/* 48 */                        this.I00iiI = 1;
/* 54 */                        if (loolooll.I0000Il00O(list2, ii1Ii1l0OI, this) == ii0111o30) {
/* 56 */                            return ii0111o30;
                                }
                            } else {
/* 23 */                        if (i40 != 1) {
/* 31 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 25 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 58 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public I00oI0i(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00iio = obj;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public I00oI0i(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 15 */            this.I00iOIl = i;
                    this.I00iiO = obj;
                    this.I00iio = obj2;
                }
            }
