            package org.tensorflow.lite;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.nio.Buffer;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.MappedByteBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Map;
            import p000.I000II;
            import p000.IIi0oIl;
            import p000.Oi010OO0;
            
            abstract class NativeInterpreterWrapper implements AutoCloseable {
                public long I00iOIl;
                public long I00iiI;
                public long I00iiO;
                public ByteBuffer I00iio;
                public final TensorImpl[] I00ilI0I1;
                public final TensorImpl[] I00ilO0;
                public boolean I00io1l;
                private long inferenceDurationNanoseconds = -1;

                public NativeInterpreterWrapper(ByteBuffer byteBuffer, IIi0oIl iIi0oIl) {
/* 9 */             this.I00io1l = false;
/* 11 */            TensorFlowLite.I00000oIO();
/* 16 */            if (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder())) {
/* 37 */                I000II.I000iOII("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
/* 41 */                throw null;
                    }
/* 42 */            this.I00iio = byteBuffer;
/* 46 */            long jCreateErrorReporter = createErrorReporter(Barcode.FORMAT_UPC_A);
/* 52 */            long jCreateModelWithBuffer = createModelWithBuffer(this.I00iio, jCreateErrorReporter);
/* 56 */            this.I00iOIl = jCreateErrorReporter;
/* 58 */            this.I00iiO = jCreateModelWithBuffer;
/* 69 */            long jCreateInterpreter = createInterpreter(jCreateModelWithBuffer, jCreateErrorReporter, iIi0oIl.I00iOIl, true, false, new ArrayList());
/* 73 */            this.I00iiI = jCreateInterpreter;
/* 75 */            hasUnresolvedFlexOp(jCreateInterpreter);
/* 86 */            this.I00ilI0I1 = new TensorImpl[getInputCount(this.I00iiI)];
/* 96 */            this.I00ilO0 = new TensorImpl[getOutputCount(this.I00iiI)];
/* 100 */           allocateTensors(this.I00iiI, jCreateErrorReporter);
/* 104 */           this.I00io1l = true;
                }

                private static native long allocateTensors(long j, long j2);

                private static native long createErrorReporter(int i);

                private static native long createInterpreter(long j, long j2, int i, boolean z, boolean z2, List<Long> list);

                private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

                private static native void delete(long j, long j2, long j3);

                private static native long deleteCancellationFlag(long j);

                private static native int getInputCount(long j);

                private static native int getInputTensorIndex(long j, int i);

                private static native int getOutputCount(long j);

                private static native int getOutputTensorIndex(long j, int i);

                private static native String[] getSignatureKeys(long j);

                private static native boolean hasUnresolvedFlexOp(long j);

                private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

                private static native void run(long j, long j2);

                public final TensorImpl I00000oIO(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 TensorImpl[] tensorImplArr = this.I00ilI0I1;
/* 6 */                 if (i < tensorImplArr.length) {
/* 8 */                     TensorImpl tensorImpl = tensorImplArr[i];
/* 10 */                    if (tensorImpl != null) {
/* 25 */                        return tensorImpl;
                            }
/* 12 */                    long j = this.I00iiI;
/* 18 */                    TensorImpl tensorImplI000II = TensorImpl.I000II(getInputTensorIndex(j, i), j);
/* 22 */                    tensorImplArr[i] = tensorImplI000II;
/* 24 */                    return tensorImplI000II;
                        }
                    }
/* 32 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i, "Invalid input Tensor index: "));
/* 35 */            return null;
                }

                public final String[] I0000Il00O() {
/* 3 */             return getSignatureKeys(this.I00iiI);
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(Object[] objArr, Map map) {
                    boolean z;
                    int[] iArr;
/* 3 */             this.inferenceDurationNanoseconds = -1L;
/* 6 */             if (objArr.length == 0) {
/* 232 */               I000II.I000iOII("Input error: Inputs should not be null or empty.");
/* 551 */               return;
                    }
/* 11 */            for (int i = 0; i < objArr.length; i++) {
/* 13 */                TensorImpl tensorImplI00000oIO = I00000oIO(i);
/* 17 */                Object obj = objArr[i];
/* 20 */                if (obj != null && !(obj instanceof Buffer)) {
/* 29 */                    tensorImplI00000oIO.I000OiO(obj);
/* 32 */                    int[] iArrI0000O = tensorImplI00000oIO.I0000O(obj);
/* 45 */                    iArr = Arrays.equals(tensorImplI00000oIO.I0000Il00O, iArrI0000O) ? null : iArrI0000O;
                        }
/* 46 */                if (iArr != null && resizeInput(this.I00iiI, this.I00iOIl, i, iArr, false)) {
/* 59 */                    this.I00io1l = false;
/* 63 */                    TensorImpl tensorImpl = this.I00ilI0I1[i];
/* 65 */                    if (tensorImpl != null) {
/* 67 */                        tensorImpl.I000O01llI0();
                            }
                        }
                    }
/* 73 */            boolean z2 = this.I00io1l;
/* 75 */            TensorImpl[] tensorImplArr = this.I00ilO0;
/* 77 */            if (z2) {
/* 79 */                z = false;
                    } else {
/* 81 */                z = true;
/* 82 */                this.I00io1l = true;
/* 88 */                allocateTensors(this.I00iiI, this.I00iOIl);
/* 93 */                for (TensorImpl tensorImpl2 : tensorImplArr) {
/* 97 */                    if (tensorImpl2 != null) {
/* 99 */                        tensorImpl2.I000O01llI0();
                            }
                        }
                    }
/* 107 */           for (int i2 = 0; i2 < objArr.length; i2++) {
/* 115 */               I00000oIO(i2).I000OOo1O(objArr[i2]);
                    }
/* 121 */           long jNanoTime = System.nanoTime();
/* 129 */           run(this.I00iiI, this.I00iOIl);
/* 136 */           long jNanoTime2 = System.nanoTime() - jNanoTime;
/* 137 */           if (z) {
/* 140 */               for (TensorImpl tensorImpl3 : tensorImplArr) {
/* 144 */                   if (tensorImpl3 != null) {
/* 146 */                       tensorImpl3.I000O01llI0();
                            }
                        }
                    }
/* 164 */           for (Map.Entry entry : map.entrySet()) {
/* 176 */               if (entry.getValue() != null) {
/* 184 */                   int iIntValue = ((Integer) entry.getKey()).intValue();
/* 188 */                   if (iIntValue < 0 || iIntValue >= tensorImplArr.length) {
/* 223 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(iIntValue, "Invalid output Tensor index: "));
/* 226 */                       return;
                            }
/* 193 */                   TensorImpl tensorImplI000II = tensorImplArr[iIntValue];
/* 195 */                   if (tensorImplI000II == null) {
/* 197 */                       long j = this.I00iiI;
/* 203 */                       tensorImplI000II = TensorImpl.I000II(getOutputTensorIndex(j, iIntValue), j);
/* 207 */                       tensorImplArr[iIntValue] = tensorImplI000II;
                            }
/* 213 */                   tensorImplI000II.I0000oI00(entry.getValue());
                        }
                    }
/* 227 */           this.inferenceDurationNanoseconds = jNanoTime2;
                }

                @Override
                public final void close() {
/* 2 */             int i = 0;
                    while (true) {
/* 3 */                 TensorImpl[] tensorImplArr = this.I00ilI0I1;
/* 7 */                 if (i >= tensorImplArr.length) {
                            break;
                        }
/* 9 */                 TensorImpl tensorImpl = tensorImplArr[i];
/* 11 */                if (tensorImpl != null) {
/* 13 */                    tensorImpl.I00000oOI();
/* 16 */                    tensorImplArr[i] = null;
                        }
/* 18 */                i++;
                    }
/* 21 */            int i2 = 0;
                    while (true) {
/* 22 */                TensorImpl[] tensorImplArr2 = this.I00ilO0;
/* 25 */                if (i2 >= tensorImplArr2.length) {
/* 45 */                    delete(this.I00iOIl, this.I00iiO, this.I00iiI);
/* 50 */                    deleteCancellationFlag(0L);
/* 53 */                    this.I00iOIl = 0L;
/* 55 */                    this.I00iiO = 0L;
/* 57 */                    this.I00iiI = 0L;
/* 59 */                    this.I00iio = null;
/* 61 */                    this.I00io1l = false;
/* 113 */                   return;
                        }
/* 27 */                TensorImpl tensorImpl2 = tensorImplArr2[i2];
/* 29 */                if (tensorImpl2 != null) {
/* 31 */                    tensorImpl2.I00000oOI();
/* 34 */                    tensorImplArr2[i2] = null;
                        }
/* 36 */                i2++;
                    }
                }
            }
