            package com.google.ai.edge.litert;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I1IoiO1l;
            import p000.Il01100l;
            import p000.Il0lIli0;
            import p000.O0000Ioio00;
            import p000.OIllioIilO;
            import p000.ilIII1o11;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/google/ai/edge/litert/TensorType;", "", "elementType", "Lcom/google/ai/edge/litert/TensorType$ElementType;", "layout", "Lcom/google/ai/edge/litert/TensorType$Layout;", "<init>", "(Lcom/google/ai/edge/litert/TensorType$ElementType;Lcom/google/ai/edge/litert/TensorType$Layout;)V", "getElementType", "()Lcom/google/ai/edge/litert/TensorType$ElementType;", "getLayout", "()Lcom/google/ai/edge/litert/TensorType$Layout;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ElementType", OIllioIilO.I00iio, "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 8 */     public final class TensorType {
                private final ElementType elementType;
                private final Layout layout;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/ai/edge/litert/TensorType$ElementType;", "", "<init>", "(Ljava/lang/String;I)V", "INT", "FLOAT", "INT8", "BOOLEAN", "INT64", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class ElementType {
                    private static final Il0lIli0 $ENTRIES;
                    private static final ElementType[] $VALUES;
                    public static final ElementType INT = new ElementType("INT", 0);
                    public static final ElementType FLOAT = new ElementType("FLOAT", 1);
                    public static final ElementType INT8 = new ElementType("INT8", 2);
                    public static final ElementType BOOLEAN = new ElementType("BOOLEAN", 3);
                    public static final ElementType INT64 = new ElementType("INT64", 4);

                    private static final ElementType[] $values() {
/* 11 */                return new ElementType[]{INT, FLOAT, INT8, BOOLEAN, INT64};
                    }

                    static {
/* 51 */                ElementType[] elementTypeArr$values = $values();
/* 55 */                $VALUES = elementTypeArr$values;
/* 61 */                $ENTRIES = ilIII1o11.I00000oIO(elementTypeArr$values);
                    }

                    private ElementType(String str, int i) {
                    }

                    public static Il0lIli0 getEntries() {
/* 1 */                 return $ENTRIES;
                    }

                    public static ElementType valueOf(String str) {
/* 7 */                 return (ElementType) Enum.valueOf(ElementType.class, str);
                    }

                    public static ElementType[] values() {
/* 7 */                 return (ElementType[]) $VALUES.clone();
                    }
                }

                public TensorType(ElementType elementType, Layout layout, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 6 */             this(elementType, (i & 2) != 0 ? null : layout);
                }

                public static TensorType copy$default(TensorType tensorType, ElementType elementType, Layout layout, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 elementType = tensorType.elementType;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                layout = tensorType.layout;
                    }
/* 13 */            return tensorType.copy(elementType, layout);
                }

                public final ElementType getElementType() {
/* 1 */             return this.elementType;
                }

                public final Layout getLayout() {
/* 1 */             return this.layout;
                }

                public final TensorType copy(ElementType elementType, Layout layout) {
/* 3 */             return new TensorType(elementType, layout);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof TensorType)) {
/* 7 */                 return false;
                    }
/* 11 */            TensorType tensorType = (TensorType) other;
                    return this.elementType == tensorType.elementType && O0000Ioio00.I0000O(this.layout, tensorType.layout);
                }

                public final ElementType getElementType() {
/* 1 */             return this.elementType;
                }

                public final Layout getLayout() {
/* 1 */             return this.layout;
                }

                public int hashCode() {
/* 7 */             int iHashCode = this.elementType.hashCode() * 31;
/* 9 */             Layout layout = this.layout;
/* 19 */            return iHashCode + (layout == null ? 0 : layout.hashCode());
                }

                public String toString() {
/* 28 */            return "TensorType(elementType=" + this.elementType + ", layout=" + this.layout + ")";
                }

/* 9 */         public TensorType(ElementType elementType, Layout layout) {
/* 11 */            this.elementType = elementType;
                    this.layout = layout;
                }

                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/google/ai/edge/litert/TensorType$Layout;", "", "dimensions", "", "", "strides", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "([I[I)V", "getDimensions", "()Ljava/util/List;", "getStrides", "rank", "getRank", "()I", "hasStrides", "", "getHasStrides", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 11 */        public static final class Layout {
                    private final List<Integer> dimensions;
                    private final List<Integer> strides;

                    public Layout(int[] iArr, int[] iArr2) {
/* 9 */                 this((List<Integer>) I1IoiO1l.I00IOO(iArr), (List<Integer>) I1IoiO1l.I00IOO(iArr2));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static Layout copy$default(Layout layout, List list, List list2, int i, Object obj) {
/* 3 */                 if ((i & 1) != 0) {
/* 5 */                     list = layout.dimensions;
                        }
/* 9 */                 if ((i & 2) != 0) {
/* 11 */                    list2 = layout.strides;
                        }
/* 13 */                return layout.copy(list, list2);
                    }

                    public final List<Integer> component1() {
/* 1 */                 return this.dimensions;
                    }

                    public final List<Integer> component2() {
/* 1 */                 return this.strides;
                    }

                    public final Layout copy(List<Integer> dimensions, List<Integer> strides) {
/* 3 */                 return new Layout(dimensions, strides);
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof Layout)) {
/* 7 */                     return false;
                        }
/* 11 */                Layout layout = (Layout) other;
                        return O0000Ioio00.I0000O(this.dimensions, layout.dimensions) && O0000Ioio00.I0000O(this.strides, layout.strides);
                    }

                    public final List<Integer> getDimensions() {
/* 1 */                 return this.dimensions;
                    }

                    public final boolean getHasStrides() {
/* 9 */                 return !this.strides.isEmpty();
                    }

                    public final int getRank() {
/* 3 */                 return this.dimensions.size();
                    }

                    public final List<Integer> getStrides() {
/* 1 */                 return this.strides;
                    }

                    public int hashCode() {
/* 15 */                return this.strides.hashCode() + (this.dimensions.hashCode() * 31);
                    }

                    public String toString() {
/* 28 */                return "Layout(dimensions=" + this.dimensions + ", strides=" + this.strides + ")";
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 12 */            public Layout(int[] iArr) {
/* 13 */                this(iArr, (int[]) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

/* 13 */            public Layout(List<Integer> list, List<Integer> list2) {
/* 15 */                this.dimensions = list;
                        this.strides = list2;
                    }

/* 15 */            public Layout(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 16 */                this((List<Integer>) list, (List<Integer>) ((i & 2) != 0 ? Il01100l.I00iOIl : list2));
                    }

/* 16 */            public Layout(int[] iArr, int[] iArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 17 */                this(iArr, (i & 2) != 0 ? new int[0] : iArr2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
/* 17 */            public Layout(List<Integer> list) {
/* 18 */                this((List) list, (List) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
/* 11 */        public TensorType(ElementType elementType) {
/* 12 */            this(elementType, null, 2, 0 == true ? 1 : 0);
                }
            }
