            package p000;

            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.util.Map;
            import org.tensorflow.lite.I00000oIO;
            
            public final class Oo0oIIO0li implements IllOOo00lI {
                public final int I00iOIl;
                public Oo0oIo00ioo I00iiI;

                public Oo0oIIO0li(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() throws IOException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Oo0oIo00ioo oo0oIo00ioo = this.I00iiI;
                    switch (i) {
                        case 0:
/* 93 */                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(oo0oIo00ioo.I00000oIO.getAssets().open("embedding/vocab.txt"), IO1IOI.I00000oIO), 8192);
                            try {
/* 96 */                        OilO0iOl oilO0iOlI00000oIO = lOliOoIi.I00000oIO(bufferedReader);
/* 103 */                       Oll1iiOII oll1iiOII = new Oll1iiOII(7);
/* 109 */                       IlIl0l ilIl0l = new IlIl0l(3);
/* 112 */                       ilIl0l.I00000oOI = oilO0iOlI00000oIO;
/* 114 */                       ilIl0l.I0000Il00O = oll1iiOII;
/* 116 */                       VarHandle.storeStoreFence();
/* 130 */                       Map mapI000OOo1O = O1Oii0O0loo.I000OOo1O(OilO1oiooiII.I0001Ioi1lo(ilIl0l, new Oo011oIOO1(13)));
/* 134 */                       bufferedReader.close();
/* 137 */                       return mapI000OOo1O;
                            } finally {
                            }
                        default:
/* 16 */                    InputStream inputStreamOpen = oo0oIo00ioo.I00000oIO.getAssets().open("embedding/all-MiniLM-L6-v2.tflite");
                            try {
/* 20 */                        byte[] bArrI00000oOI = iOiOlIoI.I00000oOI(inputStreamOpen);
/* 24 */                        inputStreamOpen.close();
/* 36 */                        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bArrI00000oOI.length).order(ByteOrder.nativeOrder());
/* 40 */                        byteBufferOrder.put(bArrI00000oOI);
/* 43 */                        byteBufferOrder.rewind();
/* 50 */                        IIi0oIl iIi0oIl = new IIi0oIl();
/* 54 */                        iIi0oIl.I00iOIl = -1;
/* 57 */                        iIi0oIl.I00iOIl = 4;
/* 59 */                        return new I00000oIO(byteBufferOrder, iIi0oIl);
                            } finally {
                            }
                    }
                }
            }
