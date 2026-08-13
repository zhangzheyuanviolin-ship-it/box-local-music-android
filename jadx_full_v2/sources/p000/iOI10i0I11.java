            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.os.Process;
            import android.util.Log;
            import android.util.SparseArray;
            import android.util.TypedValue;
            import java.lang.invoke.VarHandle;
            import java.util.WeakHashMap;
            
            public abstract class iOI10i0I11 {
                public static int I00000oIO(Context context, String str) {
/* 1 */             if (str != null) {
/* 11 */                return context.checkPermission(str, Process.myPid(), Process.myUid());
                    }
/* 18 */            IOOlIIilOl0.I000II("permission must be non-null");
/* 21 */            return 0;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                
                    if (r5.I0000Il00O == r8.hashCode()) goto L21;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static ColorStateList I00000oOI(Context context, int i) throws Resources.NotFoundException {
                    ColorStateList colorStateListI00000oIO;
                    ColorStateList colorStateList;
                    Oi0ol1 oi0ol1;
/* 1 */             Resources resources = context.getResources();
/* 5 */             Resources.Theme theme = context.getTheme();
/* 9 */             ThreadLocal threadLocal = Oi0oolOI.I00000oIO;
/* 13 */            Oi0ol1o oi0ol1o = new Oi0ol1o();
/* 16 */            oi0ol1o.I00000oIO = resources;
/* 18 */            oi0ol1o.I00000oOI = theme;
/* 20 */            VarHandle.storeStoreFence();
                    synchronized (Oi0oolOI.I0000Il00O) {
                        try {
/* 32 */                    SparseArray sparseArray = (SparseArray) Oi0oolOI.I00000oOI.get(oi0ol1o);
/* 34 */                    colorStateListI00000oIO = null;
/* 35 */                    if (sparseArray == null || sparseArray.size() <= 0 || (oi0ol1 = (Oi0ol1) sparseArray.get(i)) == null) {
/* 91 */                        colorStateList = null;
                            } else {
/* 61 */                        if (oi0ol1.I00000oOI.equals(resources.getConfiguration())) {
/* 63 */                            if (theme != null || oi0ol1.I0000Il00O != 0) {
/* 73 */                                if (theme != null) {
                                        }
                                    }
/* 83 */                            colorStateList = oi0ol1.I00000oIO;
                                }
/* 87 */                        sparseArray.remove(i);
/* 91 */                        colorStateList = null;
                            }
                        } finally {
                        }
                    }
/* 92 */            if (colorStateList != null) {
/* 94 */                return colorStateList;
                    }
/* 95 */            ThreadLocal threadLocal2 = Oi0oolOI.I00000oIO;
/* 101 */           TypedValue typedValue = (TypedValue) threadLocal2.get();
/* 103 */           if (typedValue == null) {
/* 107 */               typedValue = new TypedValue();
/* 110 */               threadLocal2.set(typedValue);
                    }
/* 114 */           resources.getValue(i, typedValue, true);
/* 117 */           int i2 = typedValue.type;
/* 121 */           if (i2 < 28 || i2 > 31) {
                        try {
/* 132 */                   colorStateListI00000oIO = IOOlOlo.I00000oIO(resources, resources.getXml(i), theme);
                        } catch (Exception e) {
/* 142 */                   Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                        }
                    }
/* 145 */           if (colorStateListI00000oIO == null) {
/* 206 */               return resources.getColorStateList(i, theme);
                    }
                    synchronized (Oi0oolOI.I0000Il00O) {
                        try {
/* 150 */                   WeakHashMap weakHashMap = Oi0oolOI.I00000oOI;
/* 156 */                   SparseArray sparseArray2 = (SparseArray) weakHashMap.get(oi0ol1o);
/* 158 */                   if (sparseArray2 == null) {
/* 162 */                       sparseArray2 = new SparseArray();
/* 165 */                       weakHashMap.put(oi0ol1o, sparseArray2);
                            }
/* 175 */                   Configuration configuration = oi0ol1o.I00000oIO.getConfiguration();
/* 179 */                   Oi0ol1 oi0ol12 = new Oi0ol1();
/* 182 */                   oi0ol12.I00000oIO = colorStateListI00000oIO;
/* 184 */                   oi0ol12.I00000oOI = configuration;
/* 194 */                   oi0ol12.I0000Il00O = theme == null ? 0 : theme.hashCode();
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   sparseArray2.append(i, oi0ol12);
                        } finally {
                        }
                    }
/* 210 */           return colorStateListI00000oIO;
                }
            }
