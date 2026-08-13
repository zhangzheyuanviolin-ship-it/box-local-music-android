            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function3;
            
            public final class OOlo0IiOl1i extends Oll0io implements Function3 {
                public final int I00iOIl;
                public int I00iiI;
                public OO11OoloI I00iiO;
                public final Function3 I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOlo0IiOl1i(Function3 function3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = function3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Function3 function3 = this.I00iio;
/* 7 */             OO11OoloI oO11OoloI = (OO11OoloI) obj;
                    switch (i) {
                        case 0:
/* 49 */                    OOlo0IiOl1i oOlo0IiOl1i = new OOlo0IiOl1i(function3, (IOoil1iiIilo) obj3, 0);
/* 52 */                    oOlo0IiOl1i.I00iiO = oO11OoloI;
/* 54 */                    return oOlo0IiOl1i.invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 32 */                    OOlo0IiOl1i oOlo0IiOl1i2 = new OOlo0IiOl1i(function3, (IOoil1iiIilo) obj3, 1);
/* 35 */                    oOlo0IiOl1i2.I00iiO = oO11OoloI;
/* 37 */                    return oOlo0IiOl1i2.invokeSuspend(ooiIlOl1iI);
                        default:
/* 17 */                    OOlo0IiOl1i oOlo0IiOl1i3 = new OOlo0IiOl1i(function3, (IOoil1iiIilo) obj3, 2);
/* 20 */                    oOlo0IiOl1i3.I00iiO = oO11OoloI;
/* 22 */                    return oOlo0IiOl1i3.invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
                /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function3] */
                /* JADX WARN: Type inference failed for: r8v1, types: [OO11OoloI] */
                /* JADX WARN: Type inference failed for: r8v2, types: [OO11OoloI] */
                /* JADX WARN: Type inference failed for: r8v4, types: [IoIioIlO0l, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v5 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objInvoke;
                    Object objInvoke2;
/* 3 */             int i = this.I00iOIl;
/* 6 */             Object obj2 = OoiIlOl1iI.I00000oIO;
/* 8 */             ?? r4 = this.I00iio;
                    switch (i) {
                        case 0:
/* 172 */                   OO11OoloI oO11OoloI = this.I00iiO;
/* 174 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 176 */                   int i2 = this.I00iiI;
                            try {
                            } catch (Throwable th) {
/* 219 */                       IoO10Iooo0 ioO10Iooo0I0000O = ((IoIlIolo10o) oO11OoloI.I00iOIl).I0000O();
/* 223 */                       this.I00iiO = null;
/* 225 */                       this.I00iiI = 2;
/* 227 */                       objInvoke = r4.invoke(ioO10Iooo0I0000O, th, this);
/* 231 */                       if (objInvoke == ii0111o) {
                                }
                            }
/* 178 */                   if (i2 == 0) {
/* 201 */                       lIoii1l01l0i.I00000oOI(obj);
/* 204 */                       this.I00iiO = oO11OoloI;
/* 206 */                       this.I00iiI = 1;
/* 233 */                       obj2 = oO11OoloI.I0000O(this) == ii0111o ? ii0111o : ii0111o;
                            } else {
/* 180 */                       if (i2 != 1) {
/* 182 */                           if (i2 != 2) {
/* 190 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 184 */                           lIoii1l01l0i.I00000oOI(obj);
/* 187 */                           objInvoke = obj;
/* 235 */                           Throwable th2 = (Throwable) objInvoke;
/* 237 */                           if (th2 == null) {
/* 239 */                               return obj2;
                                    }
/* 240 */                           throw th2;
                                }
/* 195 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 239 */                   return obj2;
                        case 1:
/* 68 */                    ?? ioIioIlO0l = this.I00iiO;
/* 70 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 72 */                    int i3 = this.I00iiI;
                            try {
                            } catch (Throwable th3) {
/* 113 */                       IoO10oI0o ioO10oI0o = (IoO10oI0o) ioIioIlO0l.I00iOIl;
/* 115 */                       O1I1OOiol o1I1OOiol = IoIiolOl00.I00000oIO;
/* 119 */                       ioIioIlO0l = new IoIioIlO0l();
/* 124 */                       ioIioIlO0l.I00iOIl = ioO10oI0o.I00000oOI;
/* 132 */                       ioIioIlO0l.I00iiI = ioO10oI0o.I00000oIO.I00000oOI();
/* 136 */                       ioIioIlO0l.I00iiO = ioO10oI0o.I0001Ioi1lo;
/* 149 */                       ioIioIlO0l.I00iio = new Io1OIO1((Map) ioO10oI0o.I0000Il00O.I00iOIl, true);
/* 151 */                       VarHandle.storeStoreFence();
/* 154 */                       this.I00iiO = null;
/* 156 */                       this.I00iiI = 2;
/* 158 */                       objInvoke2 = r4.invoke(ioIioIlO0l, th3, this);
/* 162 */                       if (objInvoke2 == ii0111o2) {
                                }
                            }
/* 74 */                    if (i3 == 0) {
/* 97 */                        lIoii1l01l0i.I00000oOI(obj);
/* 100 */                       this.I00iiO = ioIioIlO0l;
/* 102 */                       this.I00iiI = 1;
/* 164 */                       obj2 = ioIioIlO0l.I0000O(this) == ii0111o2 ? ii0111o2 : ii0111o2;
                            } else {
/* 76 */                        if (i3 != 1) {
/* 78 */                            if (i3 != 2) {
/* 86 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 80 */                            lIoii1l01l0i.I00000oOI(obj);
/* 83 */                            objInvoke2 = obj;
/* 166 */                           Throwable th4 = (Throwable) objInvoke2;
/* 168 */                           if (th4 == null) {
/* 170 */                               return obj2;
                                    }
/* 171 */                           throw th4;
                                }
/* 91 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 170 */                   return obj2;
                        default:
/* 17 */                    OO11OoloI oO11OoloI2 = this.I00iiO;
/* 19 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 21 */                    int i4 = this.I00iiI;
/* 23 */                    if (i4 != 0) {
/* 25 */                        if (i4 == 1) {
/* 27 */                            lIoii1l01l0i.I00000oOI(obj);
/* 67 */                            return obj2;
                                }
/* 31 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 36 */                    lIoii1l01l0i.I00000oOI(obj);
/* 39 */                    Object obj3 = oO11OoloI2.I00iOIl;
/* 53 */                    OiOi10iii01 oiOi10iii01 = new OiOi10iii01(1, oO11OoloI2, OO11OoloI.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 1);
/* 56 */                    this.I00iiO = null;
/* 58 */                    this.I00iiI = 1;
                            return r4.invoke(obj3, oiOi10iii01, this) == ii0111o3 ? ii0111o3 : obj2;
                    }
                }
            }
