            package p000;

            import android.media.AudioRecord;
            import android.util.Log;
            import com.k2fsa.sherpa.onnx.OfflineTts;
            import com.k2fsa.sherpa.onnx.OfflineTtsConfig;
            import com.k2fsa.sherpa.onnx.OfflineTtsModelConfig;
            import com.k2fsa.sherpa.onnx.OfflineTtsSupertonicModelConfig;
            import java.io.ByteArrayOutputStream;
            import java.io.Serializable;
            import kotlin.jvm.functions.Function1;
            
/* 23 */    public final class I1iIiio extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public Object I00iiI;
                public final Object I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;
                public final Serializable I00ilO0;
                public final Object I00io1l;
                public final Object I00ioIO;
                public final Object I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1iIiio(OliiOI oliiOI, String str, String str2, String str3, String str4, String str5, String str6, String str7, IOoil1iiIilo iOoil1iiIilo) {
/* 21 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iiI = oliiOI;
/* 6 */             this.I00iiO = str;
/* 8 */             this.I00iio = str2;
/* 10 */            this.I00ilI0I1 = str3;
/* 12 */            this.I00ilO0 = str4;
/* 14 */            this.I00io1l = str5;
/* 16 */            this.I00ioIO = str6;
/* 18 */            this.I00l0I0l0lO1 = str7;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00l0I0l0lO1;
/* 7 */             Object obj3 = this.I00ioIO;
/* 9 */             Object obj4 = this.I00io1l;
/* 11 */            Object obj5 = this.I00ilO0;
/* 13 */            Object obj6 = this.I00ilI0I1;
/* 15 */            Object obj7 = this.I00iio;
/* 17 */            Object obj8 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 86 */                    I1iIiio i1iIiio = new I1iIiio((AudioRecord) obj8, (OIool0l11) obj7, (OI10i0Il) obj6, (byte[]) obj5, (Function1) obj4, (ByteArrayOutputStream) obj3, (I0IoO01lIoO) obj2, iOoil1iiIilo);
/* 92 */                    i1iIiio.I00iiI = obj;
/* 89 */                    return i1iIiio;
                        default:
/* 54 */                    return new I1iIiio((OliiOI) this.I00iiI, (String) obj8, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (String) obj3, (String) obj2, iOoil1iiIilo);
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
/* 18 */            return ((I1iIiio) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    boolean z;
                    switch (this.I00iOIl) {
                        case 0:
/* 138 */                   Ii0110 ii0110 = (Ii0110) this.I00iiI;
/* 140 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 142 */                   lIoii1l01l0i.I00000oOI(obj);
/* 145 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 185 */                   return iOi1II01i0.I0000O(ii0110, Ii1oo1ooill0.I00iiI, null, new I1iIiii((AudioRecord) this.I00iiO, (OIool0l11) this.I00iio, (OI10i0Il) this.I00ilI0I1, (byte[]) this.I00ilO0, (Function1) this.I00io1l, (ByteArrayOutputStream) this.I00ioIO, (I0IoO01lIoO) this.I00l0I0l0lO1, (IOoil1iiIilo) null), 2);
                        default:
/* 9 */                     Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 11 */                    lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 16 */                        OliiOI oliiOI = (OliiOI) this.I00iiI;
                                try {
/* 18 */                            OfflineTts offlineTts = oliiOI.I00000oIO;
/* 20 */                            if (offlineTts != null) {
/* 22 */                                offlineTts.release();
                                    }
                                } catch (Throwable unused) {
                                }
/* 25 */                        oliiOI.I00000oIO = null;
/* 101 */                       OfflineTts offlineTts2 = new OfflineTts(null, new OfflineTtsConfig(new OfflineTtsModelConfig(null, null, null, null, null, null, new OfflineTtsSupertonicModelConfig((String) this.I00iiO, (String) this.I00iio, (String) this.I00ilI0I1, (String) this.I00ilO0, (String) this.I00io1l, (String) this.I00ioIO, (String) this.I00l0I0l0lO1), 2, false, "cpu", 63, null), null, null, 0, 0.0f, 30, null));
/* 108 */                       ((OliiOI) this.I00iiI).I00000oIO = offlineTts2;
/* 118 */                       ((OliiOI) this.I00iiI).I00000oOI = offlineTts2.sampleRate();
/* 120 */                       z = true;
                            } catch (Throwable th) {
/* 127 */                       Log.e("SupertonicEngine", "loadModel failed", th);
/* 130 */                       z = false;
                            }
/* 131 */                   return Boolean.valueOf(z);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
/* 24 */        public I1iIiio(AudioRecord audioRecord, OIool0l11 oIool0l11, OI10i0Il oI10i0Il, byte[] bArr, Function1 function1, ByteArrayOutputStream byteArrayOutputStream, I0IoO01lIoO i0IoO01lIoO, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 25 */            this.I00iiO = audioRecord;
                    this.I00iio = oIool0l11;
                    this.I00ilI0I1 = oI10i0Il;
                    this.I00ilO0 = bArr;
                    this.I00io1l = function1;
                    this.I00ioIO = byteArrayOutputStream;
                    this.I00l0I0l0lO1 = i0IoO01lIoO;
                }
            }
