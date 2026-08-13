            package p000;

            import android.media.AudioTrack;
            import com.google.mlkit.genai.common.DownloadCallback;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 17 */    public final class I1iI1o extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public final int I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;
                public final Object I00ilO0;
                public final Object I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1iI1o(OI10i0Il oI10i0Il, byte[] bArr, int i, OI10i0Il oI10i0Il2, OIooO1iiliI oIooO1iiliI, IOoil1iiIilo iOoil1iiIilo) {
/* 15 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = oI10i0Il;
/* 6 */             this.I00ilO0 = bArr;
/* 8 */             this.I00iiO = i;
/* 10 */            this.I00ilI0I1 = oI10i0Il2;
/* 12 */            this.I00io1l = oIooO1iiliI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 61 */                    return new I1iI1o((OI10i0Il) this.I00iio, (byte[]) this.I00ilO0, this.I00iiO, (OI10i0Il) this.I00ilI0I1, (OIooO1iiliI) this.I00io1l, iOoil1iiIilo);
                        default:
/* 31 */                    return new I1iI1o((o0oi0ioiO) this.I00iio, (iOil1lO10l) this.I00ilI0I1, (DownloadCallback) this.I00ilO0, (AtomicInteger) this.I00io1l, this.I00iiO, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I1iI1o) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             Object obj2 = this.I00io1l;
/* 8 */             Object obj3 = this.I00ilO0;
/* 10 */            Object obj4 = this.I00ilI0I1;
/* 12 */            Object obj5 = this.I00iio;
                    switch (i) {
                        case 0:
/* 69 */                    OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) obj2;
/* 71 */                    OI10i0Il oI10i0Il = (OI10i0Il) obj4;
/* 73 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 75 */                    int i2 = this.I00iiI;
/* 78 */                    if (i2 != 0) {
/* 80 */                        if (i2 == 1) {
/* 82 */                            lIoii1l01l0i.I00000oOI(obj);
/* 189 */                           return ooiIlOl1iI;
                                }
/* 88 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 77 */                        return null;
                            }
/* 93 */                    lIoii1l01l0i.I00000oOI(obj);
/* 106 */                   if (((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 159 */                       OI10i0Il oI10i0Il2 = (OI10i0Il) obj5;
/* 165 */                       AudioTrack audioTrack = (AudioTrack) oI10i0Il2.getValue();
/* 167 */                       if (audioTrack != null) {
/* 169 */                           audioTrack.stop();
                                }
/* 172 */                       if (audioTrack != null) {
/* 174 */                           audioTrack.release();
                                }
/* 177 */                       oI10i0Il2.setValue(null);
/* 181 */                       oIooO1iiliI.I000O01llI0(0.0f);
/* 186 */                       oI10i0Il.setValue(Boolean.FALSE);
/* 189 */                       return ooiIlOl1iI;
                            }
/* 110 */                   oI10i0Il.setValue(Boolean.TRUE);
/* 116 */                   byte[] bArr = (byte[]) obj3;
/* 122 */                   I1i1OOi1iIo i1i1OOi1iIo = new I1i1OOi1iIo(2);
/* 125 */                   i1i1OOi1iIo.I00iiI = oIooO1iiliI;
/* 127 */                   VarHandle.storeStoreFence();
/* 134 */                   I01ii1IIl i01ii1IIl = new I01ii1IIl(11);
/* 137 */                   i01ii1IIl.I00iiI = oIooO1iiliI;
/* 139 */                   i01ii1IIl.I00iiO = oI10i0Il;
/* 141 */                   VarHandle.storeStoreFence();
/* 144 */                   this.I00iiI = 1;
                            return iOOOloIOiI0.I0000Il00O((OI10i0Il) obj5, bArr, this.I00iiO, i1i1OOi1iIo, i01ii1IIl, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                        default:
/* 17 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 19 */                    int i3 = this.I00iiI;
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 24 */                    if (i3 != 0) {
/* 68 */                        return ooiIlOl1iI;
                            }
/* 32 */                    DownloadCallback downloadCallback = (DownloadCallback) obj3;
/* 39 */                    o0o0OiOiI1 o0o0oioii1 = new o0o0OiOiI1(0);
/* 42 */                    o0o0oioii1.I00iiI = (AtomicInteger) obj2;
/* 46 */                    o0o0oioii1.I00iiO = this.I00iiO;
/* 48 */                    o0o0oioii1.I00iio = downloadCallback;
/* 50 */                    VarHandle.storeStoreFence();
/* 53 */                    this.I00iiI = 1;
                            return ((o0oi0ioiO) obj5).I00000oOI((iOil1lO10l) obj4, downloadCallback, false, null, o0o0oioii1, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 18 */        public I1iI1o(o0oi0ioiO o0oi0ioio, iOil1lO10l ioil1lo10l, DownloadCallback downloadCallback, AtomicInteger atomicInteger, int i, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 19 */            this.I00iio = o0oi0ioio;
                    this.I00ilI0I1 = ioil1lo10l;
                    this.I00ilO0 = downloadCallback;
                    this.I00io1l = atomicInteger;
                    this.I00iiO = i;
                }
            }
