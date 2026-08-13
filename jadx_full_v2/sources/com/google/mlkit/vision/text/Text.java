            package com.google.mlkit.vision.text;

            import android.graphics.Matrix;
            import android.graphics.Point;
            import android.graphics.Rect;
            import com.google.mlkit.vision.common.internal.CommonConvertUtils;
            import com.google.mlkit.vision.text.Text;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import p000.lilOlilOOi;
            import p000.lolii010oOiI;
            import p000.o00Oi1I;
            import p000.o00o0iI0;
            import p000.o00oO1oo;
            import p000.o010oI1oOli;
            import p000.o01IIOl01;
            
/* 25 */    public class Text {
                private final List zza;
                private final String zzb;

                public static class Symbol extends TextBase {
                    private final float zza;
                    private final float zzb;

                    public Symbol(o01IIOl01 o01iiol01, Matrix matrix) {
/* 11 */                super(o01iiol01.I00iOIl, o01iiol01.I00iiI, o01iiol01.I00iiO, "", matrix);
/* 16 */                this.zza = o01iiol01.I00iio;
/* 20 */                this.zzb = o01iiol01.I00ilI0I1;
                    }

                    public float getAngle() {
/* 1 */                 return this.zzb;
                    }

                    public float getConfidence() {
/* 1 */                 return this.zza;
                    }

                    public String getText() {
/* 1 */                 return zza();
                    }
                }

                public static class TextBase {
                    private final String zza;
                    private final Rect zzb;
                    private final Point[] zzc;
                    private final String zzd;

                    public TextBase(String str, Rect rect, List list, String str2, Matrix matrix) {
/* 4 */                 this.zza = str;
/* 8 */                 Rect rect2 = new Rect(rect);
/* 11 */                if (matrix != null) {
/* 13 */                    CommonConvertUtils.transformRect(rect2, matrix);
                        }
/* 16 */                this.zzb = rect2;
/* 22 */                Point[] pointArr = new Point[list.size()];
/* 29 */                for (int i = 0; i < list.size(); i++) {
/* 42 */                    pointArr[i] = new Point((Point) list.get(i));
                        }
/* 47 */                if (matrix != null) {
/* 49 */                    CommonConvertUtils.transformPointArray(pointArr, matrix);
                        }
/* 52 */                this.zzc = pointArr;
/* 54 */                this.zzd = str2;
                    }

                    public Rect getBoundingBox() {
/* 1 */                 return this.zzb;
                    }

                    public Point[] getCornerPoints() {
/* 1 */                 return this.zzc;
                    }

                    public String getRecognizedLanguage() {
/* 1 */                 return this.zzd;
                    }

                    public final String zza() {
/* 1 */                 String str = this.zza;
                        return str == null ? "" : str;
                    }
                }

                public Text(o010oI1oOli o010oi1ooli, final Matrix matrix) {
/* 6 */             ArrayList arrayList = new ArrayList();
/* 9 */             this.zza = arrayList;
/* 13 */            this.zzb = o010oi1ooli.I00iOIl;
/* 26 */            arrayList.addAll(lilOlilOOi.I00000oIO(o010oi1ooli.I00iiI, new lolii010oOiI() {
                        @Override
                        public final Object zza(Object obj) {
/* 7 */                     return new Text.TextBlock((o00Oi1I) obj, matrix);
                        }
                    }));
                }

                public String getText() {
/* 1 */             return this.zzb;
                }

                public List<TextBlock> getTextBlocks() {
/* 3 */             return Collections.unmodifiableList(this.zza);
                }

/* 26 */        public static class TextBlock extends TextBase {
                    private final List zza;

                    public TextBlock(o00Oi1I o00oi1i, final Matrix matrix) {
/* 11 */                super(o00oi1i.I00iOIl, o00oi1i.I00iiI, o00oi1i.I00iiO, o00oi1i.I00iio, matrix);
/* 25 */                this.zza = lilOlilOOi.I00000oIO(o00oi1i.I00ilI0I1, new lolii010oOiI() {
                            @Override
                            public final Object zza(Object obj) {
/* 1 */                         o00oO1oo o00oo1oo = (o00oO1oo) obj;
/* 11 */                        return new Text.Line(o00oo1oo, matrix, o00oo1oo.I00ilO0, o00oo1oo.I00io1l);
                            }
                        });
                    }

                    public synchronized List<Line> getLines() {
/* 2 */                 return this.zza;
                    }

                    public String getText() {
/* 1 */                 return zza();
                    }

/* 27 */            public TextBlock(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
/* 28 */                super(str, rect, list, str2, matrix);
                        this.zza = list2;
                    }
                }

/* 29 */        public Text(String str, List list) {
                    ArrayList arrayList = new ArrayList();
                    this.zza = arrayList;
/* 31 */            arrayList.addAll(list);
                    this.zzb = str;
                }

/* 30 */        public static class Line extends TextBase {
                    private final List zza;
                    private final float zzb;
                    private final float zzc;

                    public Line(o00oO1oo o00oo1oo, final Matrix matrix, float f, float f2) {
/* 11 */                super(o00oo1oo.I00iOIl, o00oo1oo.I00iiI, o00oo1oo.I00iiO, o00oo1oo.I00iio, matrix);
/* 25 */                this.zza = lilOlilOOi.I00000oIO(o00oo1oo.I00ilI0I1, new lolii010oOiI() {
                            @Override
                            public final Object zza(Object obj) {
/* 7 */                         return new Text.Element((o00o0iI0) obj, matrix);
                            }
                        });
/* 27 */                this.zzb = f;
/* 29 */                this.zzc = f2;
                    }

                    public float getAngle() {
/* 1 */                 return this.zzc;
                    }

                    public float getConfidence() {
/* 1 */                 return this.zzb;
                    }

                    public synchronized List<Element> getElements() {
/* 2 */                 return this.zza;
                    }

                    public String getText() {
/* 1 */                 return zza();
                    }

/* 31 */            public Line(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f, float f2) {
/* 32 */                super(str, rect, list, str2, matrix);
                        this.zza = list2;
                        this.zzb = f;
                        this.zzc = f2;
                    }
                }

/* 41 */        public static class Element extends TextBase {
                    private final List zza;
                    private final float zzb;
                    private final float zzc;

                    public Element(o00o0iI0 o00o0ii0, final Matrix matrix) {
/* 11 */                super(o00o0ii0.I00iOIl, o00o0ii0.I00iiI, o00o0ii0.I00iiO, o00o0ii0.I00iio, matrix);
/* 16 */                this.zzb = o00o0ii0.I00ilI0I1;
/* 20 */                this.zzc = o00o0ii0.I00ilO0;
/* 22 */                ArrayList arrayList = o00o0ii0.I00io1l;
/* 40 */                this.zza = lilOlilOOi.I00000oIO(arrayList == null ? new ArrayList() : arrayList, new lolii010oOiI() {
                            @Override
                            public final Object zza(Object obj) {
/* 7 */                         return new Text.Symbol((o01IIOl01) obj, matrix);
                            }
                        });
                    }

                    public float getAngle() {
/* 1 */                 return this.zzc;
                    }

                    public float getConfidence() {
/* 1 */                 return this.zzb;
                    }

                    public synchronized List<Symbol> getSymbols() {
/* 2 */                 return this.zza;
                    }

                    public String getText() {
/* 1 */                 return zza();
                    }

/* 42 */            public Element(String str, Rect rect, List list, String str2, Matrix matrix, float f, float f2, List list2) {
/* 43 */                super(str, rect, list, str2, matrix);
                        this.zzb = f;
                        this.zzc = f2;
                        this.zza = list2;
                    }
                }
            }
