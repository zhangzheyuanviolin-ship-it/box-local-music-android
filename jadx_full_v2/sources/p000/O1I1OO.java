            package p000;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.database.sqlite.SQLiteDatabase;
            import android.graphics.Bitmap;
            import android.graphics.drawable.Drawable;
            import android.security.keystore.KeyGenParameterSpec;
            import android.util.Log;
            import android.util.TypedValue;
            import android.view.ContextThemeWrapper;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.widget.ImageView;
            import android.widget.ListAdapter;
            import android.widget.TextView;
            import androidx.appcompat.app.AlertController$RecycleListView;
            import com.box.gallery.R;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.File;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.TreeMap;
            
/* 57 */    public final class O1I1OO implements i0O11oO1, I1OlOl11O0 {
                public static O1I1OO I00iio;
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public O1I1OO(Context context, int i) {
/* 1 */             this.I00iOIl = i;
                    switch (i) {
                        case 7:
/* 54 */                    context.getApplicationContext();
                            break;
                        default:
/* 7 */                     int iI000OOo1O = I0ilIO0oloO1.I000OOo1O(context, 0);
/* 22 */                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, I0ilIO0oloO1.I000OOo1O(context, iI000OOo1O));
/* 25 */                    I0il0olIi1OO i0il0olIi1OO = new I0il0olIi1OO();
/* 29 */                    i0il0olIi1OO.I000OiO = -1;
/* 31 */                    i0il0olIi1OO.I00000oIO = contextThemeWrapper;
/* 41 */                    i0il0olIi1OO.I00000oOI = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
/* 43 */                    VarHandle.storeStoreFence();
/* 46 */                    this.I00iiO = i0il0olIi1OO;
/* 48 */                    this.I00iiI = iI000OOo1O;
                            break;
                    }
                }

                public static void I0001Ioi1lo(String str, Object... objArr) {
/* 7 */             I000OOo1O().I000l1(3, null, str, objArr);
                }

                public static void I000II(String str) {
/* 7 */             if (str.equalsIgnoreCase(":memory:")) {
/* 168 */               return;
                    }
/* 14 */            int length = str.length() - 1;
/* 16 */            int i = 0;
/* 17 */            boolean z = false;
/* 18 */            while (i <= length) {
/* 39 */                boolean z2 = O0000Ioio00.I0000oI00(str.charAt(!z ? i : length), 32) <= 0;
/* 40 */                if (z) {
/* 49 */                    if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z2) {
/* 46 */                    i++;
                        } else {
/* 44 */                    z = true;
                        }
                    }
/* 68 */            if (str.subSequence(i, length + 1).toString().length() == 0) {
/* 168 */               return;
                    }
/* 79 */            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                    try {
/* 87 */                SQLiteDatabase.deleteDatabase(new File(str));
                    } catch (Exception e) {
/* 94 */                Log.w("SupportSQLite", "delete failed: ", e);
                    }
                }

                public static synchronized O1I1OO I000OOo1O() {
                    O1I1OO o1i1oo;
/* 4 */             o1i1oo = I00iio;
/* 6 */             if (o1i1oo == null) {
/* 10 */                l1I0oI l1i0oi = l1I0oI.I00ilI0I1;
/* 12 */                byte b = 0;
/* 13 */                o1i1oo = new O1I1OO(b, b);
/* 16 */                o1i1oo.I00iiO = l1i0oi;
/* 18 */                int i = 7;
/* 20 */                while (i >= 2) {
/* 28 */                    ((l1I0oI) o1i1oo.I00iiO).getClass();
/* 35 */                    if (!Log.isLoggable("AppAuth", i)) {
                                break;
                            }
                            i--;
                        }
/* 42 */                o1i1oo.I00iiI = i + 1;
/* 44 */                VarHandle.storeStoreFence();
/* 47 */                I00iio = o1i1oo;
                    }
/* 53 */            return o1i1oo;
                }

                public void I00000oIO(long j) {
/* 5 */             if (I0000O(j)) {
/* 77 */                return;
                    }
/* 7 */             int i = this.I00iiI;
/* 11 */            long[] jArrCopyOf = (long[]) this.I00iiO;
/* 14 */            if (i >= jArrCopyOf.length) {
/* 25 */                jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
/* 29 */                this.I00iiO = jArrCopyOf;
                    }
/* 31 */            jArrCopyOf[i] = j;
/* 35 */            if (i >= this.I00iiI) {
/* 39 */                this.I00iiI = i + 1;
                    }
                }

                public void I00000oOI() {
                    WeakReference weakReference;
/* 2 */             this.I00iiI = 0;
/* 12 */            Iterator it = ((LinkedHashMap) this.I00iiO).values().iterator();
/* 20 */            while (it.hasNext()) {
/* 26 */                ArrayList arrayList = (ArrayList) it.next();
/* 33 */                if (arrayList.size() <= 1) {
/* 39 */                    OOllo0OO0O oOllo0OO0O = (OOllo0OO0O) IOOi0Ool1i.I00II0Ol1O0l(arrayList);
/* 55 */                    if (((oOllo0OO0O == null || (weakReference = oOllo0OO0O.I00000oOI) == null) ? null : (Bitmap) weakReference.get()) == null) {
/* 57 */                        it.remove();
                            }
                        } else {
/* 61 */                    int size = arrayList.size();
/* 66 */                    int i = 0;
/* 67 */                    for (int i2 = 0; i2 < size; i2++) {
/* 69 */                        int i3 = i2 - i;
/* 83 */                        if (((OOllo0OO0O) arrayList.get(i3)).I00000oOI.get() == null) {
/* 85 */                            arrayList.remove(i3);
/* 88 */                            i++;
                                }
                            }
/* 97 */                    if (arrayList.isEmpty()) {
/* 99 */                        it.remove();
                            }
                        }
                    }
                }

                @Override
                public Object I0000Il00O() {
/* 3 */             i0O1I1o i0o1i1o = (i0O1I1o) this.I00iiO;
/* 5 */             int i = this.I00iiI;
/* 7 */             i0O10o1 i0o10o1I00000oIO = i0o1i1o.I00000oIO(i);
/* 11 */            i0Il00O1 i0il00o1 = i0o1i1o.I00000oIO;
/* 13 */            int i2 = i0o10o1I00000oIO.I00000oOI;
/* 15 */            i0O1001OIi i0o1001oii = i0o10o1I00000oIO.I0000Il00O;
/* 17 */            int i3 = i0o1001oii.I0000Il00O;
/* 19 */            long j = i0o1001oii.I00000oIO;
/* 23 */            String str = (String) i0o1001oii.I0000O;
/* 27 */            if (i3 != 5 && i3 != 6 && i3 != 4) {
/* 54 */                throw new i0O0lI1oiO(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
                    }
/* 63 */            if (i0il00o1.I0000Il00O(i2, j, str).exists()) {
/* 70 */                i0Il00O1.I000O01llI0(i0il00o1.I0000Il00O(i2, j, str));
                    }
/* 73 */            int i4 = i0o1001oii.I0000Il00O;
/* 75 */            if ((i4 != 5 && i4 != 6) || !i0il00o1.I000iOII(i2, j, str).exists()) {
/* 97 */                return null;
                    }
/* 94 */            i0Il00O1.I000O01llI0(i0il00o1.I000iOII(i2, j, str));
/* 97 */            return null;
                }

                public boolean I0000O(long j) {
/* 1 */             int i = this.I00iiI;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 15 */                if (((long[]) this.I00iiO)[i2] == j) {
/* 17 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public I0ilIO0oloO1 I0000oI00() {
                    int i;
/* 5 */             I0il0olIi1OO i0il0olIi1OO = (I0il0olIi1OO) this.I00iiO;
/* 7 */             ContextThemeWrapper contextThemeWrapper = i0il0olIi1OO.I00000oIO;
/* 11 */            int iI000OOo1O = I0ilIO0oloO1.I000OOo1O(contextThemeWrapper, this.I00iiI);
/* 18 */            int i2 = 1;
/* 19 */            if (iI000OOo1O == 0) {
/* 23 */                TypedValue typedValue = new TypedValue();
/* 30 */                contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
/* 33 */                i = typedValue.resourceId;
                    } else {
/* 36 */                i = iI000OOo1O;
                    }
/* 37 */            I0ilIO0oloO1 i0ilIO0oloO1 = new I0ilIO0oloO1(contextThemeWrapper, i);
/* 42 */            I11olO0Iloo i11olO0Iloo = new I11olO0Iloo();
/* 45 */            i11olO0Iloo.I00iOIl = i0ilIO0oloO1;
/* 47 */            VarHandle.storeStoreFence();
/* 50 */            i0ilIO0oloO1.I00ilO0 = i11olO0Iloo;
/* 52 */            I11lil0o i11lil0oI0001Ioi1lo = i0ilIO0oloO1.I0001Ioi1lo();
/* 56 */            if (iI000OOo1O == 0) {
/* 60 */                TypedValue typedValue2 = new TypedValue();
/* 67 */                contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
/* 70 */                iI000OOo1O = typedValue2.resourceId;
                    }
/* 75 */            ((I11oi01ll) i11lil0oI0001Ioi1lo).I010lI0oi = iI000OOo1O;
/* 77 */            i11lil0oI0001Ioi1lo.I0000Il00O();
/* 82 */            Context context = i0ilIO0oloO1.getContext();
/* 86 */            Window window = i0ilIO0oloO1.getWindow();
/* 90 */            I0ilI1OoOo i0ilI1OoOo = new I0ilI1OoOo();
/* 94 */            i0ilI1OoOo.I000II = false;
/* 97 */            i0ilI1OoOo.I00111O = -1;
/* 101 */           I0I0o01l i0I0o01l = new I0I0o01l(i2);
/* 104 */           i0I0o01l.I00iiI = i0ilI1OoOo;
/* 106 */           VarHandle.storeStoreFence();
/* 109 */           i0ilI1OoOo.I001i1lo1io = i0I0o01l;
/* 111 */           i0ilI1OoOo.I00000oIO = context;
/* 113 */           i0ilI1OoOo.I00000oOI = i0ilIO0oloO1;
/* 115 */           i0ilI1OoOo.I0000Il00O = window;
/* 119 */           I0il100iO i0il100iO = new I0il100iO();
/* 127 */           i0il100iO.I00000oIO = new WeakReference(i0ilIO0oloO1);
/* 129 */           i0ilI1OoOo.I001i1O0Ol = i0il100iO;
/* 137 */           TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, OOilOli0.I0000oI00, R.attr.alertDialogStyle, 0);
/* 145 */           i0ilI1OoOo.I001IIilI0O = typedArrayObtainStyledAttributes.getResourceId(0, 0);
/* 148 */           typedArrayObtainStyledAttributes.getResourceId(2, 0);
/* 152 */           int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
/* 157 */           typedArrayObtainStyledAttributes.getResourceId(5, 0);
/* 161 */           int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
/* 166 */           int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(3, 0);
/* 175 */           i0ilI1OoOo.I001IO000 = typedArrayObtainStyledAttributes.getBoolean(6, true);
/* 177 */           typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
/* 180 */           typedArrayObtainStyledAttributes.recycle();
/* 187 */           i0ilIO0oloO1.I0001Ioi1lo().I000II(1);
/* 190 */           VarHandle.storeStoreFence();
/* 193 */           i0ilIO0oloO1.I00io1l = i0ilI1OoOo;
/* 195 */           VarHandle.storeStoreFence();
/* 198 */           View view = i0il0olIi1OO.I0000oI00;
/* 200 */           if (view != null) {
/* 202 */               i0ilI1OoOo.I0010I0i = view;
                    } else {
/* 205 */               CharSequence charSequence = i0il0olIi1OO.I0000O;
/* 207 */               if (charSequence != null) {
/* 209 */                   i0ilI1OoOo.I0000O = charSequence;
/* 211 */                   TextView textView = i0ilI1OoOo.I00100l0;
/* 213 */                   if (textView != null) {
/* 215 */                       textView.setText(charSequence);
                            }
                        }
/* 218 */               Drawable drawable = i0il0olIi1OO.I0000Il00O;
/* 220 */               if (drawable != null) {
/* 222 */                   i0ilI1OoOo.I000o00OoI0I = drawable;
/* 224 */                   ImageView imageView = i0ilI1OoOo.I000oI1ioi;
/* 226 */                   if (imageView != null) {
/* 228 */                       imageView.setVisibility(0);
/* 233 */                       i0ilI1OoOo.I000oI1ioi.setImageDrawable(drawable);
                            }
                        }
                    }
/* 238 */           if (i0il0olIi1OO.I000II != null) {
/* 246 */               AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) i0il0olIi1OO.I00000oOI.inflate(resourceId, (ViewGroup) null);
/* 250 */               if (!i0il0olIi1OO.I000OOo1O) {
/* 253 */                   resourceId2 = resourceId3;
                        }
/* 254 */               ListAdapter i0il1l1II = i0il0olIi1OO.I000II;
/* 256 */               if (i0il1l1II == null) {
/* 266 */                   i0il1l1II = new I0il1l1II(i0il0olIi1OO.I00000oIO, resourceId2, android.R.id.text1, null);
                        }
/* 269 */               i0ilI1OoOo.I0010o = i0il1l1II;
/* 273 */               i0ilI1OoOo.I00111O = i0il0olIi1OO.I000OiO;
/* 277 */               if (i0il0olIi1OO.I000O01llI0 != null) {
/* 281 */                   I0il01i1oii1 i0il01i1oii1 = new I0il01i1oii1();
/* 284 */                   i0il01i1oii1.I00iiI = i0il0olIi1OO;
/* 286 */                   i0il01i1oii1.I00iOIl = i0ilI1OoOo;
/* 288 */                   VarHandle.storeStoreFence();
/* 291 */                   alertController$RecycleListView.setOnItemClickListener(i0il01i1oii1);
                        }
/* 296 */               if (i0il0olIi1OO.I000OOo1O) {
/* 298 */                   alertController$RecycleListView.setChoiceMode(1);
                        }
/* 301 */               i0ilI1OoOo.I0000oI00 = alertController$RecycleListView;
                    }
/* 303 */           i0ilIO0oloO1.setCancelable(true);
/* 306 */           i0ilIO0oloO1.setCanceledOnTouchOutside(true);
/* 309 */           i0ilIO0oloO1.setOnCancelListener(null);
/* 312 */           i0ilIO0oloO1.setOnDismissListener(null);
/* 315 */           O1iloOI1l o1iloOI1l = i0il0olIi1OO.I0001Ioi1lo;
/* 317 */           if (o1iloOI1l != null) {
/* 319 */               i0ilIO0oloO1.setOnKeyListener(o1iloOI1l);
                    }
/* 743 */           return i0ilIO0oloO1;
                }

                public void I000O01llI0(int i, int i2) {
/* 1 */             int i3 = i2 + i;
/* 4 */             char[] cArr = (char[]) this.I00iiO;
/* 7 */             if (cArr.length <= i3) {
/* 9 */                 int i4 = i * 2;
/* 11 */                if (i3 < i4) {
/* 13 */                    i3 = i4;
                        }
/* 18 */                this.I00iiO = Arrays.copyOf(cArr, i3);
                    }
                }

                public boolean I000OiO() {
                    return this.I00iiI < ((ArrayList) this.I00iiO).size();
                }

                public void I000iOII(int i, I1Ool00ioI i1Ool00ioI) {
                    while (true) {
/* 1 */                 int i2 = i >> 1;
/* 3 */                 if (i2 == 0) {
                            break;
                        }
/* 9 */                 I1Ool00ioI i1Ool00ioI2 = ((I1Ool00ioI[]) this.I00iiO)[i2];
/* 22 */                if (O0000Ioio00.I0001Ioi1lo(0L, i1Ool00ioI.I0000Il00O - i1Ool00ioI2.I0000Il00O) <= 0) {
                            break;
                        }
/* 24 */                i1Ool00ioI2.I0001Ioi1lo = i;
/* 30 */                ((I1Ool00ioI[]) this.I00iiO)[i] = i1Ool00ioI2;
/* 32 */                i = i2;
                    }
/* 38 */            ((I1Ool00ioI[]) this.I00iiO)[i] = i1Ool00ioI;
/* 40 */            i1Ool00ioI.I0001Ioi1lo = i;
                }

                public void I000l1(int i, Exception exc, String str, Object... objArr) {
/* 3 */             l1I0oI l1i0oi = (l1I0oI) this.I00iiO;
/* 7 */             if (this.I00iiI > i) {
/* 9 */                 return;
                    }
/* 12 */            if (objArr.length >= 1) {
/* 15 */                str = String.format(str, objArr);
                    }
/* 19 */            if (exc != null) {
/* 23 */                StringBuilder sb = new StringBuilder(str);
/* 28 */                sb.append("\n");
/* 31 */                l1i0oi.getClass();
/* 38 */                sb.append(Log.getStackTraceString(exc));
/* 41 */                str = sb.toString();
                    }
/* 45 */            l1i0oi.getClass();
/* 50 */            Log.println(i, "AppAuth", str);
                }

                public void I000lI(Olil0l0 olil0l0) {
/* 3 */             I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iiO;
/* 7 */             Olil0III olil0III = new Olil0III(olil0l0);
/* 12 */            IioliO10l iioliO10l = (IioliO10l) i0Oi111ii.I00iiO;
/* 16 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                    try {
/* 24 */                boolean z = false;
/* 25 */                if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 35 */                    if (oiIIl0O1l0lI00000oIO.getLong(0) == 0) {
/* 37 */                        z = true;
                            }
                        }
/* 42 */                iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 45 */                iioliO10l.I00000oIO(olil0III);
/* 48 */                if (!z) {
/* 50 */                    I0OIOIi1 i0OIOIi1I000II = iioliO10l.I000II(olil0III);
/* 56 */                    if (!i0OIOIi1I000II.I00000oOI) {
/* 63 */                        OIiilo1Ool0o.I00100l0("Pre-packaged database has an invalid schema: ", i0OIOIi1I000II.I0000Il00O);
/* 99 */                        return;
                            }
                        }
/* 67 */                i0Oi111ii.I00Iooi00oi(olil0III);
/* 70 */                iioliO10l.I0000Il00O();
/* 79 */                Iterator it = ((List) i0Oi111ii.I00iio).iterator();
/* 87 */                while (it.hasNext()) {
/* 95 */                    ((IOIio10l0I1I) it.next()).getClass();
                        }
                    } catch (Throwable th) {
                        try {
/* 100 */                   throw th;
                        } catch (Throwable th2) {
/* 102 */                   iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, th);
/* 168 */                   throw th2;
                        }
                    }
                }

                public void I000o00OoI0I(Olil0l0 olil0l0, int i, int i2) {
/* 1 */             I00100l0(olil0l0, i, i2);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000oI1ioi(Olil0l0 olil0l0) throws Throwable {
                    boolean z;
                    Object objI00000oIO;
                    I0OIOIi1 i0OIOIi1I000II;
/* 3 */             I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iiO;
/* 7 */             Olil0III olil0III = new Olil0III(olil0l0);
/* 12 */            IioliO10l iioliO10l = (IioliO10l) i0Oi111ii.I00iiO;
/* 18 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
                    try {
/* 27 */                if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 44 */                    z = oiIIl0O1l0lI00000oIO.getLong(0) != 0;
                        }
/* 46 */                iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 49 */                if (z) {
/* 53 */                    oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                            try {
/* 70 */                        String strI00i0O = oiIIl0O1l0lI00000oIO.I00ol1() ? oiIIl0O1l0lI00000oIO.I00i0O(0) : null;
/* 71 */                        iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 82 */                        if (!((String) iioliO10l.I00000oOI).equals(strI00i0O) && !((String) iioliO10l.I0000Il00O).equals(strI00i0O)) {
/* 130 */                           throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) iioliO10l.I00000oOI) + ", found: " + strI00i0O).toString());
                                }
                            } finally {
                            }
                        } else {
/* 139 */                   lO0I0Io.I00000oIO(olil0III, "BEGIN EXCLUSIVE TRANSACTION");
                            try {
/* 142 */                       i0OIOIi1I000II = iioliO10l.I000II(olil0III);
                            } catch (Throwable th) {
/* 185 */                       objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                            }
/* 148 */                   if (!i0OIOIi1I000II.I00000oOI) {
/* 184 */                       throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + i0OIOIi1I000II.I0000Il00O).toString());
                            }
/* 150 */                   iioliO10l.I0000oI00();
/* 153 */                   i0Oi111ii.I00Iooi00oi(olil0III);
/* 156 */                   objI00000oIO = OoiIlOl1iI.I00000oIO;
/* 191 */                   if (!(objI00000oIO instanceof Oi10Ii1i1lo)) {
/* 198 */                       lO0I0Io.I00000oIO(olil0III, "END TRANSACTION");
                            }
/* 201 */                   Throwable thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 205 */                   if (thI00000oOI != null) {
/* 314 */                       lO0I0Io.I00000oIO(olil0III, "ROLLBACK TRANSACTION");
/* 317 */                       throw thI00000oOI;
                            }
/* 207 */                   Oi10ii.I00000oIO(objI00000oIO);
                        }
/* 210 */               iioliO10l.I0000O(olil0III);
/* 227 */               for (IOIio10l0I1I iOIio10l0I1I : (List) i0Oi111ii.I00iio) {
/* 235 */                   iOIio10l0I1I.getClass();
/* 240 */                   if (olil0III instanceof Olil0III) {
/* 242 */                       int i = iOIio10l0I1I.I00000oIO;
/* 244 */                       Olil0l0 olil0l02 = olil0III.I00iOIl;
                                switch (i) {
                                    case 0:
/* 257 */                               olil0l02.I0010o();
                                        try {
/* 264 */                                   StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
/* 271 */                                   ((o0llIi) iOIio10l0I1I.I00000oOI).getClass();
/* 282 */                                   sb.append(System.currentTimeMillis() - 86400000);
/* 287 */                                   sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
/* 294 */                                   olil0l02.I001IO000(sb.toString());
/* 297 */                                   olil0l02.I00O10llo();
                                            break;
                                        } finally {
/* 305 */                                   olil0l02.I00OloOo();
                                        }
                                    default:
/* 253 */                               ((OIoO1Ol) iOIio10l0I1I.I00000oOI).invoke(olil0l02);
                                        break;
                                }
                            }
                        }
/* 309 */               i0Oi111ii.I00io1l = olil0l0;
                    } finally {
                        try {
/* 318 */                   throw th;
                        } finally {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:118:0x00a4 A[EDGE_INSN: B:118:0x00a4->B:39:0x00a4 BREAK  A[LOOP:4: B:9:0x002e->B:122:?], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00100l0(Olil0l0 olil0l0, int i, int i2) {
                    Iterable iterable;
                    OIoi0IIoi oIoi0IIoi;
                    boolean z;
                    boolean z2;
/* 9 */             I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iiO;
/* 15 */            Olil0III olil0III = new Olil0III(olil0l0);
/* 20 */            IioliO10l iioliO10l = (IioliO10l) i0Oi111ii.I00iiO;
/* 24 */            Ii1OiOOl1 ii1OiOOl1 = (Ii1OiOOl1) i0Oi111ii.I00iiI;
/* 26 */            O100010Iili o100010Iili = ii1OiOOl1.I00000oIO;
/* 30 */            if (i == i2) {
/* 32 */                iterable = Il01100l.I00iOIl;
                    } else {
/* 40 */                boolean z3 = i2 > i;
/* 43 */                ArrayList arrayList = new ArrayList();
/* 46 */                int i3 = i;
/* 163 */               do {
/* 47 */                    if (z3) {
/* 49 */                        if (i3 >= i2) {
/* 167 */                           iterable = arrayList;
                                    break;
                                }
/* 54 */                        LinkedHashMap linkedHashMap = o100010Iili.I00000oIO;
/* 56 */                        if (z3) {
/* 90 */                            TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
/* 92 */                            if (treeMap != null) {
/* 101 */                               oIoi0IIoi = new OIoi0IIoi(treeMap, treeMap.keySet());
                                    }
/* 104 */                           if (oIoi0IIoi != null) {
                                    }
                                } else {
/* 66 */                            TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
/* 78 */                            oIoi0IIoi = treeMap2 == null ? null : new OIoi0IIoi(treeMap2, treeMap2.descendingKeySet());
/* 104 */                           if (oIoi0IIoi != null) {
                                        break;
                                    }
/* 109 */                           Map map = (Map) oIoi0IIoi.I00iOIl;
/* 115 */                           Iterator it = ((Iterable) oIoi0IIoi.I00iiI).iterator();
/* 123 */                           while (it.hasNext()) {
/* 131 */                               int iIntValue = ((Number) it.next()).intValue();
/* 135 */                               if (!z3) {
/* 144 */                                   if (i2 <= iIntValue && iIntValue < i3) {
/* 156 */                                       arrayList.add(map.get(Integer.valueOf(iIntValue)));
/* 159 */                                       z = true;
/* 160 */                                       i3 = iIntValue;
                                                break;
                                                break;
                                            }
                                        } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
/* 156 */                                   arrayList.add(map.get(Integer.valueOf(iIntValue)));
/* 159 */                                   z = true;
/* 160 */                                   i3 = iIntValue;
                                            break;
                                        }
                                    }
/* 162 */                           z = false;
                                }
                            } else {
/* 52 */                        if (i3 <= i2) {
/* 167 */                           iterable = arrayList;
                                    break;
                                }
/* 54 */                        LinkedHashMap linkedHashMap2 = o100010Iili.I00000oIO;
/* 56 */                        if (z3) {
                                }
                            }
/* 163 */               } while (z);
/* 165 */               iterable = null;
                    }
/* 168 */           if (iterable != null) {
/* 170 */               iioliO10l.I0001Ioi1lo(olil0III);
/* 175 */               Iterator it2 = iterable.iterator();
/* 183 */               while (it2.hasNext()) {
/* 191 */                   ((O1loO1O1OO) it2.next()).I00000oIO(olil0III);
                        }
/* 195 */               I0OIOIi1 i0OIOIi1I000II = iioliO10l.I000II(olil0III);
/* 201 */               if (!i0OIOIi1I000II.I00000oOI) {
/* 215 */                   OIiilo1Ool0o.I00100l0("Migration didn't properly handle: ", i0OIOIi1I000II.I0000Il00O);
/* 439 */                   return;
                        } else {
/* 203 */                   iioliO10l.I0000oI00();
/* 206 */                   i0Oi111ii.I00Iooi00oi(olil0III);
/* 439 */                   return;
                        }
                    }
/* 220 */           if (i <= i2 || !ii1OiOOl1.I000O01llI0) {
/* 228 */               Set set = ii1OiOOl1.I000OOo1O;
/* 246 */               z2 = ii1OiOOl1.I000II && (set == null || !set.contains(Integer.valueOf(i)));
                    }
/* 247 */           if (z2) {
/* 1638 */              throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
                    }
/* 251 */           if (ii1OiOOl1.I000l1) {
/* 255 */               OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                        try {
/* 259 */                   O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 267 */                   while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 269 */                       String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 279 */                       if (!OlOolloIIOl0.I000l1(strI00i0O, "sqlite_", false) && !strI00i0O.equals("android_metadata")) {
/* 309 */                           o101lO1I0000oI00.add(new OIoi0IIoi(strI00i0O, Boolean.valueOf(O0000Ioio00.I0000O(oiIIl0O1l0lI00000oIO.I00i0O(1), "view"))));
                                }
                            }
/* 316 */                   O101lO1 o101lO1I0000Il00O = IOOi1I.I0000Il00O(o101lO1I0000oI00);
/* 321 */                   iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 324 */                   ListIterator listIterator = o101lO1I0000Il00O.listIterator(0);
                            while (true) {
/* 329 */                       Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator;
/* 335 */                       if (!io1ioiIIO1lI.hasNext()) {
                                    break;
                                }
/* 341 */                       OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) io1ioiIIO1lI.next();
/* 345 */                       String str = (String) oIoi0IIoi2.I00iOIl;
/* 357 */                       if (((Boolean) oIoi0IIoi2.I00iiI).booleanValue()) {
/* 376 */                           lO0I0Io.I00000oIO(olil0III, "DROP VIEW IF EXISTS `" + str + '`');
                                } else {
/* 397 */                           lO0I0Io.I00000oIO(olil0III, "DROP TABLE IF EXISTS `" + str + '`');
                                }
                            }
                        } catch (Throwable th) {
                            try {
/* 401 */                       throw th;
                            } catch (Throwable th2) {
/* 403 */                       iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, th);
/* 406 */                       throw th2;
                            }
                        }
                    } else {
/* 407 */               iioliO10l.I00000oOI(olil0III);
                    }
/* 416 */           Iterator it3 = ((List) i0Oi111ii.I00iio).iterator();
/* 424 */           while (it3.hasNext()) {
/* 432 */               ((IOIio10l0I1I) it3.next()).getClass();
                    }
/* 436 */           iioliO10l.I00000oIO(olil0III);
                }

                public void I00100o1O0lo() {
/* 1 */             IO110lIo iO110lIo = IO110lIo.I0000Il00O;
/* 5 */             char[] cArr = (char[]) this.I00iiO;
                    synchronized (iO110lIo) {
/* 8 */                 int i = iO110lIo.I00000oOI;
/* 14 */                if (cArr.length + i < I1Io1lOI.I00000oIO) {
/* 18 */                    iO110lIo.I00000oOI = i + cArr.length;
/* 22 */                    iO110lIo.I00000oIO.addLast(cArr);
                        }
                    }
                }

                public void I0010I0i(long j) {
/* 1 */             int i = this.I00iiI;
/* 3 */             int i2 = 0;
/* 4 */             while (i2 < i) {
/* 14 */                if (j == ((long[]) this.I00iiO)[i2]) {
                            int i3 = this.I00iiI - 1;
/* 20 */                    while (i2 < i3) {
/* 24 */                        long[] jArr = (long[]) this.I00iiO;
/* 26 */                        int i4 = i2 + 1;
/* 30 */                        jArr[i2] = jArr[i4];
/* 32 */                        i2 = i4;
                            }
                            this.I00iiI--;
/* 40 */                    return;
                        }
/* 41 */                i2++;
                    }
                }

                public void I0010o(I1Ool00ioI i1Ool00ioI) {
                    I1Ool00ioI i1Ool00ioI2;
/* 1 */             int i = i1Ool00ioI.I0001Ioi1lo;
/* 4 */             if (i == -1) {
/* 126 */               I000II.I000iOII("Failed requirement.");
/* 168 */               return;
                    }
/* 6 */             int i2 = this.I00iiI;
/* 10 */            I1Ool00ioI[] i1Ool00ioIArr = (I1Ool00ioI[]) this.I00iiO;
/* 12 */            I1Ool00ioI i1Ool00ioI3 = i1Ool00ioIArr[i2];
/* 14 */            i1Ool00ioI.I0001Ioi1lo = -1;
/* 17 */            i1Ool00ioIArr[i2] = null;
/* 21 */            this.I00iiI = i2 - 1;
/* 23 */            if (i1Ool00ioI == i1Ool00ioI3) {
/* 25 */                return;
                    }
/* 33 */            int iI0001Ioi1lo = O0000Ioio00.I0001Ioi1lo(0L, i1Ool00ioI3.I0000Il00O - i1Ool00ioI.I0000Il00O);
/* 37 */            if (iI0001Ioi1lo == 0) {
/* 43 */                ((I1Ool00ioI[]) this.I00iiO)[i] = i1Ool00ioI3;
/* 45 */                i1Ool00ioI3.I0001Ioi1lo = i;
/* 47 */                return;
                    }
/* 48 */            if (iI0001Ioi1lo >= 0) {
/* 120 */               I000iOII(i, i1Ool00ioI3);
/* 123 */               return;
                    }
                    while (true) {
/* 50 */                int i3 = i << 1;
/* 52 */                int i4 = i3 + 1;
/* 54 */                int i5 = this.I00iiI;
/* 56 */                if (i4 > i5) {
/* 80 */                    if (i3 > i5) {
                                break;
                            } else {
/* 86 */                        i1Ool00ioI2 = ((I1Ool00ioI[]) this.I00iiO)[i3];
                            }
                        } else {
/* 60 */                    I1Ool00ioI[] i1Ool00ioIArr2 = (I1Ool00ioI[]) this.I00iiO;
/* 62 */                    i1Ool00ioI2 = i1Ool00ioIArr2[i3];
/* 64 */                    I1Ool00ioI i1Ool00ioI4 = i1Ool00ioIArr2[i4];
/* 75 */                    if (O0000Ioio00.I0001Ioi1lo(0L, i1Ool00ioI4.I0000Il00O - i1Ool00ioI2.I0000Il00O) >= 0) {
/* 78 */                        i1Ool00ioI2 = i1Ool00ioI4;
                            }
                        }
/* 97 */                if (O0000Ioio00.I0001Ioi1lo(0L, i1Ool00ioI2.I0000Il00O - i1Ool00ioI3.I0000Il00O) <= 0) {
                            break;
                        }
/* 99 */                int i6 = i1Ool00ioI2.I0001Ioi1lo;
/* 101 */               i1Ool00ioI2.I0001Ioi1lo = i;
/* 107 */               ((I1Ool00ioI[]) this.I00iiO)[i] = i1Ool00ioI2;
/* 109 */               i = i6;
                    }
/* 115 */           ((I1Ool00ioI[]) this.I00iiO)[i] = i1Ool00ioI3;
/* 117 */           i1Ool00ioI3.I0001Ioi1lo = i;
                }

                public synchronized void I00111O(O1il00oooo o1il00oooo, Bitmap bitmap, Map map, int i) {
                    try {
/* 4 */                 LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iiO;
/* 6 */                 Object arrayList = linkedHashMap.get(o1il00oooo);
/* 10 */                if (arrayList == null) {
/* 14 */                    arrayList = new ArrayList();
/* 17 */                    linkedHashMap.put(o1il00oooo, arrayList);
                        }
/* 23 */                ArrayList arrayList2 = (ArrayList) arrayList;
/* 25 */                int iIdentityHashCode = System.identityHashCode(bitmap);
/* 33 */                WeakReference weakReference = new WeakReference(bitmap);
/* 36 */                OOllo0OO0O oOllo0OO0O = new OOllo0OO0O();
/* 39 */                oOllo0OO0O.I00000oIO = iIdentityHashCode;
/* 41 */                oOllo0OO0O.I00000oOI = weakReference;
/* 43 */                oOllo0OO0O.I0000Il00O = map;
/* 45 */                oOllo0OO0O.I0000O = i;
/* 47 */                VarHandle.storeStoreFence();
/* 50 */                int size = arrayList2.size();
/* 54 */                int i2 = 0;
                        while (true) {
/* 55 */                    if (i2 >= size) {
/* 90 */                        arrayList2.add(oOllo0OO0O);
                                break;
                            }
/* 61 */                    OOllo0OO0O oOllo0OO0O2 = (OOllo0OO0O) arrayList2.get(i2);
/* 65 */                    if (i < oOllo0OO0O2.I0000O) {
/* 87 */                        i2++;
                            } else if (oOllo0OO0O2.I00000oIO == iIdentityHashCode && oOllo0OO0O2.I00000oOI.get() == bitmap) {
/* 79 */                        arrayList2.set(i2, oOllo0OO0O);
                            } else {
/* 83 */                        arrayList2.add(i2, oOllo0OO0O);
                            }
                        }
/* 93 */                int i3 = this.I00iiI;
/* 97 */                this.I00iiI = i3 + 1;
/* 101 */               if (i3 >= 10) {
/* 103 */                   I00000oOI();
                        }
                    } catch (Throwable th) {
/* 204 */               throw th;
                    }
                }

                public void I001IIilI0O() {
/* 6 */             if (IIlIOloOOO.I001lIiIIo1O(1) != 0) {
/* 31 */                I000II.I000iOII("Unsupported scheme: ".concat("AES256_GCM"));
                    } else if (((KeyGenParameterSpec) this.I00iiO) == null) {
/* 14 */                this.I00iiI = 1;
                    } else {
/* 19 */                I000II.I000iOII("KeyScheme set after setting a KeyGenParamSpec");
                    }
                }

                public void I001IO000(OIIl1OIol oIIl1OIol) {
/* 1 */             OIIl1OIol oIIl1OIol2 = oIIl1OIol.I00000oOI;
/* 3 */             while (oIIl1OIol2 != null) {
/* 5 */                 OIIl1OIol oIIl1OIol3 = oIIl1OIol2.I0000oI00;
/* 7 */                 oIIl1OIol2.I00000oIO(this);
/* 10 */                oIIl1OIol2 = oIIl1OIol3;
                    }
                }

                public void I001i1O0Ol(String str) {
/* 1 */             int length = str.length();
/* 5 */             if (length == 0) {
/* 7 */                 return;
                    }
/* 10 */            I000O01llI0(this.I00iiI, length);
/* 24 */            str.getChars(0, str.length(), (char[]) this.I00iiO, this.I00iiI);
                    this.I00iiI += length;
                }

                @Override
                public ListenableFuture call() {
/* 7 */             return ((I0Oi111ii) this.I00iiO).I00OIl(this.I00iiI);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 6:
/* 20 */                    return new String((char[]) this.I00iiO, 0, this.I00iiI);
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 58 */        public O1I1OO(Object obj, int i, int i2) {
/* 59 */            this.I00iOIl = i2;
                    this.I00iiO = obj;
                    this.I00iiI = i;
                }

/* 59 */        public O1I1OO(I0Oi111ii i0Oi111ii, int i) {
                    this.I00iOIl = 12;
/* 60 */            this.I00iiO = i0Oi111ii;
/* 61 */            this.I00iOIl = 12;
/* 63 */            this.I00iiI = i;
                }

/* 63 */        public O1I1OO(int i, byte b) {
/* 64 */            this.I00iOIl = i;
                }
            }
