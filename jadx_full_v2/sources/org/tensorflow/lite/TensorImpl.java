            package org.tensorflow.lite;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.nio.Buffer;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.FloatBuffer;
            import java.nio.IntBuffer;
            import java.nio.LongBuffer;
            import java.nio.ShortBuffer;
            import java.util.Arrays;
            import p000.I000II;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.OIiilo1Ool0o;
            import p000.il0Io010;
            
            final class TensorImpl {
                public long I00000oIO;
                public int I00000oOI;
                public int[] I0000Il00O;

                public static int I0000Il00O(Object obj) {
/* 2 */             if (obj != null && obj.getClass().isArray()) {
/* 19 */                if (Array.getLength(obj) != 0) {
/* 29 */                    return I0000Il00O(Array.get(obj, 0)) + 1;
                        }
/* 34 */                I000II.I000iOII("Array lengths cannot be 0.");
                    }
/* 1 */             return 0;
                }

                public static void I0001Ioi1lo(Object obj, int i, int[] iArr) {
/* 2 */             if (i == iArr.length) {
/* 37 */                return;
                    }
/* 5 */             int length = Array.getLength(obj);
/* 9 */             int i2 = iArr[i];
/* 11 */            if (i2 == 0) {
/* 13 */                iArr[i] = length;
                    } else if (i2 != length) {
/* 56 */                OIiilo1Ool0o.I000l1("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(i)});
/* 215 */               return;
                    }
/* 18 */            int i3 = i + 1;
/* 21 */            if (i3 == iArr.length) {
/* 37 */                return;
                    }
/* 25 */            for (int i4 = 0; i4 < length; i4++) {
/* 31 */                I0001Ioi1lo(Array.get(obj, i4), i3, iArr);
                    }
                }

                public static TensorImpl I000II(int i, long j) {
                    int i2;
/* 4 */             long jCreate = create(j, i, 0);
/* 8 */             TensorImpl tensorImpl = new TensorImpl();
/* 11 */            tensorImpl.I00000oIO = jCreate;
/* 13 */            int iDtype = dtype(jCreate);
                    switch (iDtype) {
                        case 1:
/* 48 */                    i2 = 1;
                            break;
                        case 2:
/* 46 */                    i2 = 2;
                            break;
                        case 3:
/* 44 */                    i2 = 3;
                            break;
                        case 4:
/* 42 */                    i2 = 4;
                            break;
                        case 5:
/* 40 */                    i2 = 5;
                            break;
                        case 6:
/* 38 */                    i2 = 6;
                            break;
                        case 7:
/* 36 */                    i2 = 7;
                            break;
                        case 8:
                        default:
/* 28 */                    I000II.I000iOII(IIlIOloOOO.I00100l0("DataType error: DataType ", iDtype, " is not recognized in Java."));
/* 31 */                    return null;
                        case 9:
/* 33 */                    i2 = 8;
                            break;
                    }
/* 49 */            tensorImpl.I00000oOI = i2;
/* 55 */            tensorImpl.I0000Il00O = shape(jCreate);
/* 57 */            shapeSignature(jCreate);
/* 60 */            quantizationScale(jCreate);
/* 63 */            quantizationZeroPoint(jCreate);
/* 66 */            VarHandle.storeStoreFence();
/* 69 */            return tensorImpl;
                }

                private static native ByteBuffer buffer(long j);

                private static native long create(long j, int i, int i2);

                private static native void delete(long j);

                private static native int dtype(long j);

                private static native boolean hasDelegateBufferHandle(long j);

                private static native String name(long j);

                private static native int numBytes(long j);

                private static native float quantizationScale(long j);

                private static native int quantizationZeroPoint(long j);

                private static native void readMultiDimensionalArray(long j, Object obj);

                private static native int[] shape(long j);

                private static native int[] shapeSignature(long j);

                private static native void writeDirectBuffer(long j, Buffer buffer);

                private static native void writeMultiDimensionalArray(long j, Object obj);

                private static native void writeScalar(long j, Object obj);

                public final ByteBuffer I00000oIO() {
/* 11 */            return buffer(this.I00000oIO).order(ByteOrder.nativeOrder());
                }

                public final void I00000oOI() {
/* 3 */             delete(this.I00000oIO);
/* 8 */             this.I00000oIO = 0L;
                }

                public final int[] I0000O(Object obj) {
/* 1 */             int iI0000Il00O = I0000Il00O(obj);
/* 8 */             if (this.I00000oOI == 5) {
/* 10 */                Class<?> componentType = obj.getClass();
/* 18 */                if (componentType.isArray()) {
/* 24 */                    while (componentType.isArray()) {
/* 26 */                        componentType = componentType.getComponentType();
                            }
/* 37 */                    if (Byte.TYPE.equals(componentType)) {
                                iI0000Il00O--;
                            }
                        }
                    }
/* 41 */            int[] iArr = new int[iI0000Il00O];
/* 44 */            I0001Ioi1lo(obj, 0, iArr);
/* 49 */            return iArr;
                }

                public final void I0000oI00(Object obj) {
/* 1 */             if (obj == null) {
/* 9 */                 if (hasDelegateBufferHandle(this.I00000oIO)) {
/* 11 */                    return;
                        }
/* 14 */                I000II.I000iOII("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
/* 17 */                return;
                    }
/* 18 */            I000OiO(obj);
/* 21 */            boolean z = obj instanceof Buffer;
/* 23 */            if (z) {
/* 30 */                int iNumBytes = numBytes(this.I00000oIO);
/* 34 */                boolean z2 = obj instanceof ByteBuffer;
/* 36 */                int iCapacity = ((Buffer) obj).capacity();
/* 40 */                if (!z2) {
/* 49 */                    iCapacity *= IIl001iO0Io.I00000oIO(this.I00000oOI);
                        }
/* 50 */                if (iNumBytes > iCapacity) {
/* 73 */                    OIiilo1Ool0o.I000l1("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", new Object[]{name(this.I00000oIO), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)});
/* 76 */                    return;
                        }
                    } else {
/* 77 */                int[] iArrI0000O = I0000O(obj);
/* 87 */                if (!Arrays.equals(iArrI0000O, this.I0000Il00O)) {
/* 201 */                   String strName = name(this.I00000oIO);
/* 207 */                   String string = Arrays.toString(this.I0000Il00O);
/* 231 */                   I000II.I000iOII(IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("Cannot copy from a TensorFlowLite tensor (", strName, ") with shape ", string, " to a Java object with shape "), Arrays.toString(iArrI0000O), "."));
/* 966 */                   return;
                        }
                    }
/* 89 */            if (!z) {
/* 195 */               readMultiDimensionalArray(this.I00000oIO, obj);
/* 198 */               return;
                    }
/* 91 */            Buffer buffer = (Buffer) obj;
/* 95 */            if (buffer instanceof ByteBuffer) {
/* 103 */               ((ByteBuffer) buffer).put(I00000oIO());
/* 106 */               return;
                    }
/* 109 */           if (buffer instanceof FloatBuffer) {
/* 121 */               ((FloatBuffer) buffer).put(I00000oIO().asFloatBuffer());
/* 124 */               return;
                    }
/* 127 */           if (buffer instanceof LongBuffer) {
/* 139 */               ((LongBuffer) buffer).put(I00000oIO().asLongBuffer());
/* 142 */               return;
                    }
/* 145 */           if (buffer instanceof IntBuffer) {
/* 157 */               ((IntBuffer) buffer).put(I00000oIO().asIntBuffer());
                    } else if (buffer instanceof ShortBuffer) {
/* 175 */               ((ShortBuffer) buffer).put(I00000oIO().asShortBuffer());
                    } else {
/* 189 */               I000II.I000iOII("Unexpected output buffer type: ".concat(String.valueOf(buffer)));
                    }
                }

                public final void I000O01llI0() {
/* 7 */             this.I0000Il00O = shape(this.I00000oIO);
                }

                public final void I000OOo1O(Object obj) {
/* 1 */             int i = this.I00000oOI;
/* 3 */             if (obj == null) {
/* 11 */                if (hasDelegateBufferHandle(this.I00000oIO)) {
/* 13 */                    return;
                        }
/* 16 */                I000II.I000iOII("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
/* 19 */                return;
                    }
/* 20 */            I000OiO(obj);
/* 23 */            boolean z = obj instanceof Buffer;
/* 25 */            if (z) {
/* 32 */                int iNumBytes = numBytes(this.I00000oIO);
/* 36 */                boolean z2 = obj instanceof ByteBuffer;
/* 38 */                int iCapacity = ((Buffer) obj).capacity();
/* 42 */                if (!z2) {
/* 49 */                    iCapacity *= IIl001iO0Io.I00000oIO(i);
                        }
/* 50 */                if (iNumBytes != iCapacity) {
/* 73 */                    OIiilo1Ool0o.I000l1("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", new Object[]{name(this.I00000oIO), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)});
/* 76 */                    return;
                        }
                    } else {
/* 77 */                int[] iArrI0000O = I0000O(obj);
/* 87 */                if (!Arrays.equals(iArrI0000O, this.I0000Il00O)) {
/* 344 */                   String strName = name(this.I00000oIO);
/* 350 */                   String string = Arrays.toString(this.I0000Il00O);
/* 374 */                   I000II.I000iOII(IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("Cannot copy to a TensorFlowLite tensor (", strName, ") with shape ", string, " from a Java object with shape "), Arrays.toString(iArrI0000O), "."));
/* 966 */                   return;
                        }
                    }
/* 89 */            if (!z) {
/* 309 */               if (i == 5 && this.I0000Il00O.length == 0) {
/* 318 */                   writeScalar(this.I00000oIO, obj);
/* 321 */                   return;
                        }
/* 326 */               boolean zIsArray = obj.getClass().isArray();
/* 330 */               long j = this.I00000oIO;
/* 332 */               if (zIsArray) {
/* 334 */                   writeMultiDimensionalArray(j, obj);
/* 337 */                   return;
                        } else {
/* 338 */                   writeScalar(j, obj);
/* 341 */                   return;
                        }
                    }
/* 91 */            Buffer buffer = (Buffer) obj;
/* 95 */            if (buffer instanceof ByteBuffer) {
/* 98 */                ByteBuffer byteBuffer = (ByteBuffer) buffer;
/* 104 */               if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
/* 118 */                   writeDirectBuffer(this.I00000oIO, buffer);
/* 121 */                   return;
                        } else {
/* 126 */                   I00000oIO().put(byteBuffer);
/* 129 */                   return;
                        }
                    }
/* 132 */           if (buffer instanceof LongBuffer) {
/* 135 */               LongBuffer longBuffer = (LongBuffer) buffer;
/* 141 */               if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
/* 155 */                   writeDirectBuffer(this.I00000oIO, buffer);
/* 158 */                   return;
                        } else {
/* 167 */                   I00000oIO().asLongBuffer().put(longBuffer);
/* 170 */                   return;
                        }
                    }
/* 173 */           if (buffer instanceof FloatBuffer) {
/* 176 */               FloatBuffer floatBuffer = (FloatBuffer) buffer;
/* 182 */               if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
/* 196 */                   writeDirectBuffer(this.I00000oIO, buffer);
/* 199 */                   return;
                        } else {
/* 208 */                   I00000oIO().asFloatBuffer().put(floatBuffer);
/* 211 */                   return;
                        }
                    }
/* 214 */           if (buffer instanceof IntBuffer) {
/* 217 */               IntBuffer intBuffer = (IntBuffer) buffer;
/* 223 */               if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
/* 237 */                   writeDirectBuffer(this.I00000oIO, buffer);
/* 240 */                   return;
                        } else {
/* 249 */                   I00000oIO().asIntBuffer().put(intBuffer);
/* 252 */                   return;
                        }
                    }
/* 255 */           if (!(buffer instanceof ShortBuffer)) {
/* 304 */               I000II.I000iOII("Unexpected input buffer type: ".concat(String.valueOf(buffer)));
/* 307 */               return;
                    }
/* 258 */           ShortBuffer shortBuffer = (ShortBuffer) buffer;
/* 264 */           if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
/* 278 */               writeDirectBuffer(this.I00000oIO, buffer);
                    } else {
/* 290 */               I00000oIO().asShortBuffer().put(shortBuffer);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
                
                    if (java.lang.String.class.equals(r0) != false) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x00bc, code lost:
                
                    if (java.lang.String.class.equals(r0) != false) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:62:0x00bf, code lost:
                
                    p000.I000II.I000iOII("DataType error: cannot resolve DataType of ".concat(r11.getClass().getName()));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x00d0, code lost:
                
                    return;
                 */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OiO(Object obj) {
/* 1 */             int i = this.I00000oOI;
/* 5 */             if (obj instanceof ByteBuffer) {
/* 7 */                 return;
                    }
/* 8 */             Class<?> componentType = obj.getClass();
/* 18 */            int i2 = 6;
/* 25 */            if (componentType.isArray()) {
/* 31 */                while (componentType.isArray()) {
/* 33 */                    componentType = componentType.getComponentType();
                        }
/* 44 */                if (Float.TYPE.equals(componentType)) {
/* 46 */                    i2 = 1;
                        } else if (Integer.TYPE.equals(componentType)) {
/* 57 */                    i2 = 2;
                        } else if (Short.TYPE.equals(componentType)) {
/* 68 */                    i2 = 7;
                        } else {
/* 77 */                    if (Byte.TYPE.equals(componentType)) {
/* 79 */                        if (i != 5) {
/* 84 */                            i2 = 3;
                                }
                            } else if (Long.TYPE.equals(componentType)) {
/* 95 */                        i2 = 4;
                            } else if (!Boolean.TYPE.equals(componentType)) {
                            }
/* 81 */                    i2 = 5;
                        }
                    } else if (!Float.class.equals(componentType) && !(obj instanceof FloatBuffer)) {
/* 134 */               if (!Integer.class.equals(componentType) && !(obj instanceof IntBuffer)) {
/* 147 */                   if (!Short.class.equals(componentType) && !(obj instanceof ShortBuffer)) {
/* 160 */                       if (!Byte.class.equals(componentType)) {
/* 169 */                           if (!Long.class.equals(componentType) && !(obj instanceof LongBuffer)) {
/* 182 */                               if (!Boolean.class.equals(componentType)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 210 */           if (i2 == i || il0Io010.I00000oIO(i2).equals(il0Io010.I00000oIO(i))) {
/* 966 */               return;
                    }
/* 233 */           String name = obj.getClass().getName();
/* 283 */           throw new IllegalArgumentException("Cannot convert between a TensorFlowLite tensor with type " + IIl001iO0Io.I001lloI(i) + " and a Java object of type " + name + " (which is compatible with the TensorFlowLite type " + IIl001iO0Io.I001lloI(i2) + ").");
                }
            }
