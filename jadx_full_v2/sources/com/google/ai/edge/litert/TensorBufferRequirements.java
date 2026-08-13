            package com.google.ai.edge.litert;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import p000.I1IoiO1l;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/google/ai/edge/litert/TensorBufferRequirements;", "", "supportedTypes", "", "Lcom/google/ai/edge/litert/TensorBufferType;", "bufferSize", "", "strides", "<init>", "(Ljava/util/List;ILjava/util/List;)V", "", "([II[I)V", "getSupportedTypes", "()Ljava/util/List;", "getBufferSize", "()I", "getStrides", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 31 */    public final class TensorBufferRequirements {
                private final int bufferSize;
                private final List<Integer> strides;
                private final List<TensorBufferType> supportedTypes;

                public TensorBufferRequirements(int[] iArr, int i, int[] iArr2) {
/* 4 */             ArrayList arrayList = new ArrayList(iArr.length);
/* 9 */             for (int i2 : iArr) {
/* 19 */                arrayList.add(TensorBufferType.INSTANCE.of(i2));
                    }
/* 29 */            this(arrayList, i, (List<Integer>) I1IoiO1l.I00IOO(iArr2));
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static TensorBufferRequirements copy$default(TensorBufferRequirements tensorBufferRequirements, List list, int i, List list2, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 list = tensorBufferRequirements.supportedTypes;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                i = tensorBufferRequirements.bufferSize;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                list2 = tensorBufferRequirements.strides;
                    }
/* 19 */            return tensorBufferRequirements.copy(list, i, list2);
                }

                public final List<TensorBufferType> component1() {
/* 1 */             return this.supportedTypes;
                }

                public final int getBufferSize() {
/* 1 */             return this.bufferSize;
                }

                public final List<Integer> component3() {
/* 1 */             return this.strides;
                }

                public final TensorBufferRequirements copy(List<? extends TensorBufferType> supportedTypes, int bufferSize, List<Integer> strides) {
/* 3 */             return new TensorBufferRequirements(supportedTypes, bufferSize, strides);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof TensorBufferRequirements)) {
/* 7 */                 return false;
                    }
/* 11 */            TensorBufferRequirements tensorBufferRequirements = (TensorBufferRequirements) other;
                    return O0000Ioio00.I0000O(this.supportedTypes, tensorBufferRequirements.supportedTypes) && this.bufferSize == tensorBufferRequirements.bufferSize && O0000Ioio00.I0000O(this.strides, tensorBufferRequirements.strides);
                }

                public final int getBufferSize() {
/* 1 */             return this.bufferSize;
                }

                public final List<Integer> getStrides() {
/* 1 */             return this.strides;
                }

                public final List<TensorBufferType> getSupportedTypes() {
/* 1 */             return this.supportedTypes;
                }

                public int hashCode() {
/* 22 */            return this.strides.hashCode() + IIl001iO0Io.I0000O(this.bufferSize, this.supportedTypes.hashCode() * 31, 31);
                }

                public String toString() {
/* 38 */            return "TensorBufferRequirements(supportedTypes=" + this.supportedTypes + ", bufferSize=" + this.bufferSize + ", strides=" + this.strides + ")";
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 32 */        public TensorBufferRequirements(List<? extends TensorBufferType> list, int i, List<Integer> list2) {
/* 34 */            this.supportedTypes = list;
/* 35 */            this.bufferSize = i;
/* 36 */            this.strides = list2;
                }
            }
