            package p000;

            import android.content.Context;
            import android.media.AudioRecord;
            import android.net.Uri;
            import java.io.ByteArrayOutputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.ShortBuffer;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 21 */    public final class I1iIiii extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 1;
                public final Function1 I00iiI;
                public final OI10i0Il I00iiO;
                public final Object I00iio;
                public final Object I00ilI0I1;
                public final Object I00ilO0;
                public final Object I00io1l;
                public final Object I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1iIiii(Context context, Ii0110 ii0110, Ioiol1OIol ioiol1OIol, Uri uri, Function1 function1, OIooO1iiliI oIooO1iiliI, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo) {
/* 19 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = context;
/* 6 */             this.I00ilI0I1 = ii0110;
/* 8 */             this.I00ilO0 = ioiol1OIol;
/* 10 */            this.I00io1l = uri;
/* 12 */            this.I00iiI = function1;
/* 14 */            this.I00ioIO = oIooO1iiliI;
/* 16 */            this.I00iiO = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00ioIO;
/* 7 */             Object obj3 = this.I00io1l;
/* 9 */             Object obj4 = this.I00ilO0;
/* 11 */            Object obj5 = this.I00ilI0I1;
/* 13 */            Object obj6 = this.I00iio;
                    switch (i) {
                        case 0:
/* 68 */                    return new I1iIiii((AudioRecord) obj6, (OIool0l11) obj5, this.I00iiO, (byte[]) obj4, this.I00iiI, (ByteArrayOutputStream) obj3, (I0IoO01lIoO) obj2, iOoil1iiIilo);
                        default:
/* 35 */                    OI10i0Il oI10i0Il = this.I00iiO;
/* 41 */                    return new I1iIiii((Context) obj6, (Ii0110) obj5, (Ioiol1OIol) obj4, (Uri) obj3, this.I00iiI, (OIooO1iiliI) obj2, oI10i0Il, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Exception {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 28 */                    ((I1iIiii) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((I1iIiii) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Exception {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             OI10i0Il oI10i0Il = this.I00iiO;
/* 9 */             int i2 = 3;
/* 10 */            Object obj2 = this.I00ioIO;
/* 12 */            Function1 function1 = this.I00iiI;
/* 14 */            Object obj3 = this.I00io1l;
/* 16 */            Object obj4 = this.I00ilO0;
/* 18 */            Object obj5 = this.I00ilI0I1;
/* 20 */            Object obj6 = this.I00iio;
                    switch (i) {
                        case 0:
/* 109 */                   byte[] bArr = (byte[]) obj4;
/* 111 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 113 */                   lIoii1l01l0i.I00000oOI(obj);
/* 116 */                   AudioRecord audioRecord = (AudioRecord) obj6;
/* 118 */                   audioRecord.startRecording();
/* 121 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 125 */                   OIool0l11 oIool0l11 = (OIool0l11) obj5;
/* 129 */                   oIool0l11.I000O01llI0(0L);
                            while (true) {
/* 136 */                       AudioRecord audioRecord2 = (AudioRecord) oI10i0Il.getValue();
/* 138 */                       if (audioRecord2 == null || audioRecord2.getRecordingState() != 3) {
                                    break;
                                } else {
/* 148 */                           int i3 = audioRecord.read(bArr, 0, bArr.length);
/* 152 */                           if (i3 > 0) {
/* 164 */                               ShortBuffer shortBufferAsShortBuffer = ByteBuffer.wrap(bArr, 0, i3).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
/* 168 */                               int i4 = 0;
/* 173 */                               while (shortBufferAsShortBuffer.hasRemaining()) {
/* 179 */                                   int iAbs = Math.abs((int) shortBufferAsShortBuffer.get());
/* 183 */                                   if (iAbs > i4) {
/* 185 */                                       i4 = iAbs;
                                            }
                                        }
/* 192 */                               function1.invoke(new Integer(i4));
/* 198 */                               ((ByteArrayOutputStream) obj3).write(bArr, 0, i3);
                                    }
/* 206 */                           oIool0l11.I000O01llI0(System.currentTimeMillis() - jCurrentTimeMillis);
/* 217 */                           if (oIool0l11.I000II() >= 30000) {
/* 221 */                               ((I0IoO01lIoO) obj2).invoke();
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
/* 25 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 27 */                    lIoii1l01l0i.I00000oOI(obj);
/* 31 */                    Context context = (Context) obj6;
/* 35 */                    Ioiol1OIol ioiol1OIol = (Ioiol1OIol) obj4;
/* 37 */                    String strI0010I0i = ioiol1OIol.I0010I0i();
/* 41 */                    long jI0010o = ioiol1OIol.I0010o();
/* 51 */                    O1l110o o1l110o = new O1l110o(6);
/* 54 */                    o1l110o.I00iiI = function1;
/* 56 */                    o1l110o.I00iiO = ioiol1OIol;
/* 58 */                    VarHandle.storeStoreFence();
/* 65 */                    I1i1OOi1iIo i1i1OOi1iIo = new I1i1OOi1iIo(i2);
/* 68 */                    i1i1OOi1iIo.I00iiI = (OIooO1iiliI) obj2;
/* 70 */                    VarHandle.storeStoreFence();
/* 76 */                    O1i0lolo o1i0lolo = new O1i0lolo(5);
/* 79 */                    o1i0lolo.I00iiI = oI10i0Il;
/* 81 */                    VarHandle.storeStoreFence();
/* 84 */                    List list = O1oOO0O1l0.I00000oIO;
/* 86 */                    IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 105 */                   iOi1II01i0.I0000O((Ii0110) obj5, Ii1oo1ooill0.I00iiI, null, new O1oOI1oil0((Uri) obj3, strI0010I0i, jI0010o, context, i1i1OOi1iIo, o1i0lolo, o1l110o, null), 2);
                            break;
                    }
/* 108 */           return ooiIlOl1iI;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 22 */        public I1iIiii(AudioRecord audioRecord, OIool0l11 oIool0l11, OI10i0Il oI10i0Il, byte[] bArr, Function1 function1, ByteArrayOutputStream byteArrayOutputStream, I0IoO01lIoO i0IoO01lIoO, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 23 */            this.I00iio = audioRecord;
                    this.I00ilI0I1 = oIool0l11;
                    this.I00iiO = oI10i0Il;
                    this.I00ilO0 = bArr;
                    this.I00iiI = function1;
                    this.I00io1l = byteArrayOutputStream;
                    this.I00ioIO = i0IoO01lIoO;
                }
            }
