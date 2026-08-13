            package p000;

            import android.content.ActivityNotFoundException;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.res.Resources;
            import android.graphics.drawable.Drawable;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.Log;
            import android.util.SparseArray;
            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            import android.view.ViewConfiguration;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CopyOnWriteArrayList;
            
/* 11 */    public class O1illlIiilIl implements Menu {
                public static final int[] I001iOo1i0O = {1, 4, 5, 3, 2, 0};
                public final Context I00000oIO;
                public final Resources I00000oOI;
                public boolean I0000Il00O;
                public final boolean I0000O;
                public O1ilOII I0000oI00;
                public final ArrayList I0001Ioi1lo;
                public final ArrayList I000II;
                public boolean I000O01llI0;
                public final ArrayList I000OOo1O;
                public final ArrayList I000OiO;
                public boolean I000iOII;
                public CharSequence I000lI;
                public Drawable I000o00OoI0I;
                public View I000oI1ioi;
                public O1ioIIl I001IO000;
                public boolean I001i1lo1io;
                public int I000l1 = 0;
                public boolean I00100l0 = false;
                public boolean I00100o1O0lo = false;
                public boolean I0010I0i = false;
                public boolean I0010o = false;
                public final ArrayList I00111O = new ArrayList();
                public final CopyOnWriteArrayList I001IIilI0O = new CopyOnWriteArrayList();
                public boolean I001i1O0Ol = false;

                public O1illlIiilIl(Context context) {
/* 4 */             boolean z = false;
/* 31 */            this.I00000oIO = context;
/* 33 */            Resources resources = context.getResources();
/* 37 */            this.I00000oOI = resources;
/* 44 */            this.I0001Ioi1lo = new ArrayList();
/* 51 */            this.I000II = new ArrayList();
/* 54 */            this.I000O01llI0 = true;
/* 61 */            this.I000OOo1O = new ArrayList();
/* 68 */            this.I000OiO = new ArrayList();
/* 70 */            this.I000iOII = true;
/* 78 */            if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
/* 90 */                z = true;
                    }
/* 91 */            this.I0000O = z;
                }

                public final O1ioIIl I00000oIO(int i, int i2, int i3, CharSequence charSequence) {
/* 6 */             int i4 = ((-65536) & i3) >> 16;
/* 8 */             if (i4 < 0 || i4 >= 6) {
/* 105 */               I000II.I000iOII("order does not contain a valid category.");
/* 7 */                 return null;
                    }
/* 22 */            int i5 = (I001iOo1i0O[i4] << 16) | (65535 & i3);
/* 23 */            int i6 = this.I000l1;
/* 27 */            O1ioIIl o1ioIIl = new O1ioIIl();
/* 32 */            o1ioIIl.I000OOo1O = Barcode.FORMAT_AZTEC;
/* 34 */            o1ioIIl.I000iOII = Barcode.FORMAT_AZTEC;
/* 36 */            int i7 = 0;
/* 37 */            o1ioIIl.I000lI = 0;
/* 39 */            o1ioIIl.I0010o = null;
/* 41 */            o1ioIIl.I00111O = null;
/* 43 */            o1ioIIl.I001IIilI0O = false;
/* 45 */            o1ioIIl.I001IO000 = false;
/* 47 */            o1ioIIl.I001i1O0Ol = false;
/* 49 */            o1ioIIl.I001i1lo1io = 16;
/* 51 */            o1ioIIl.I001lloI = false;
/* 53 */            o1ioIIl.I000o00OoI0I = this;
/* 55 */            o1ioIIl.I00000oIO = i2;
/* 57 */            o1ioIIl.I00000oOI = i;
/* 59 */            o1ioIIl.I0000Il00O = i3;
/* 61 */            o1ioIIl.I0000O = i5;
/* 63 */            o1ioIIl.I0000oI00 = charSequence;
/* 65 */            o1ioIIl.I001iOo1i0O = i6;
/* 67 */            VarHandle.storeStoreFence();
/* 70 */            ArrayList arrayList = this.I0001Ioi1lo;
/* 77 */            int size = arrayList.size() - 1;
                    while (true) {
/* 78 */                if (size < 0) {
                            break;
                        }
/* 88 */                if (((O1ioIIl) arrayList.get(size)).I0000O <= i5) {
/* 90 */                    i7 = size + 1;
                            break;
                        }
                        size--;
                    }
/* 96 */            arrayList.add(i7, o1ioIIl);
/* 99 */            I00100l0(true);
/* 102 */           return o1ioIIl;
                }

                public final void I00000oOI(O1l0iiO o1l0iiO, Context context) {
/* 8 */             this.I001IIilI0O.add(new WeakReference(o1l0iiO));
/* 11 */            o1l0iiO.I000iOII(context, this);
/* 15 */            this.I000iOII = true;
                }

                public final void I0000Il00O(boolean z) {
/* 3 */             if (this.I0010o) {
/* 5 */                 return;
                    }
/* 7 */             this.I0010o = true;
/* 9 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I001IIilI0O;
/* 11 */            Iterator it = copyOnWriteArrayList.iterator();
/* 19 */            while (it.hasNext()) {
/* 25 */                WeakReference weakReference = (WeakReference) it.next();
/* 31 */                O1l0iiO o1l0iiO = (O1l0iiO) weakReference.get();
/* 33 */                if (o1l0iiO == null) {
/* 35 */                    copyOnWriteArrayList.remove(weakReference);
                        } else {
/* 39 */                    o1l0iiO.I0000O(this, z);
                        }
                    }
/* 44 */            this.I0010o = false;
                }

                public boolean I0000O(O1ioIIl o1ioIIl) {
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I001IIilI0O;
/* 7 */             boolean zI0000oI00 = false;
/* 8 */             if (!copyOnWriteArrayList.isEmpty() && this.I001IO000 == o1ioIIl) {
/* 15 */                I001i1O0Ol();
/* 18 */                Iterator it = copyOnWriteArrayList.iterator();
/* 26 */                while (it.hasNext()) {
/* 32 */                    WeakReference weakReference = (WeakReference) it.next();
/* 38 */                    O1l0iiO o1l0iiO = (O1l0iiO) weakReference.get();
/* 40 */                    if (o1l0iiO == null) {
/* 42 */                        copyOnWriteArrayList.remove(weakReference);
                            } else {
/* 46 */                        zI0000oI00 = o1l0iiO.I0000oI00(o1ioIIl);
/* 50 */                        if (zI0000oI00) {
                                    break;
                                }
                            }
                        }
/* 52 */                I001IO000();
/* 55 */                if (zI0000oI00) {
/* 58 */                    this.I001IO000 = null;
                        }
                    }
/* 77 */            return zI0000oI00;
                }

                public boolean I0000oI00(O1illlIiilIl o1illlIiilIl, MenuItem menuItem) {
/* 1 */             O1ilOII o1ilOII = this.I0000oI00;
                    return o1ilOII != null && o1ilOII.I0000O(o1illlIiilIl, menuItem);
                }

                public boolean I0001Ioi1lo(O1ioIIl o1ioIIl) {
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I001IIilI0O;
/* 7 */             boolean zI000O01llI0 = false;
/* 8 */             if (copyOnWriteArrayList.isEmpty()) {
/* 7 */                 return false;
                    }
/* 11 */            I001i1O0Ol();
/* 14 */            Iterator it = copyOnWriteArrayList.iterator();
/* 22 */            while (it.hasNext()) {
/* 28 */                WeakReference weakReference = (WeakReference) it.next();
/* 34 */                O1l0iiO o1l0iiO = (O1l0iiO) weakReference.get();
/* 36 */                if (o1l0iiO == null) {
/* 38 */                    copyOnWriteArrayList.remove(weakReference);
                        } else {
/* 42 */                    zI000O01llI0 = o1l0iiO.I000O01llI0(o1ioIIl);
/* 46 */                    if (zI000O01llI0) {
                                break;
                            }
                        }
                    }
/* 48 */            I001IO000();
/* 51 */            if (zI000O01llI0) {
/* 53 */                this.I001IO000 = o1ioIIl;
                    }
/* 77 */            return zI000O01llI0;
                }

                public final O1ioIIl I000II(int i, KeyEvent keyEvent) {
/* 1 */             ArrayList arrayList = this.I00111O;
/* 3 */             arrayList.clear();
/* 6 */             I000O01llI0(arrayList, i, keyEvent);
/* 13 */            if (arrayList.isEmpty()) {
/* 96 */                return null;
                    }
/* 16 */            int metaState = keyEvent.getMetaState();
/* 22 */            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
/* 25 */            keyEvent.getKeyData(keyData);
/* 28 */            int size = arrayList.size();
/* 34 */            if (size == 1) {
/* 40 */                return (O1ioIIl) arrayList.get(0);
                    }
/* 43 */            boolean zI000o00OoI0I = I000o00OoI0I();
/* 48 */            for (int i2 = 0; i2 < size; i2++) {
/* 54 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayList.get(i2);
/* 61 */                char c = zI000o00OoI0I ? o1ioIIl.I000OiO : o1ioIIl.I000O01llI0;
/* 63 */                char[] cArr = keyData.meta;
/* 67 */                if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zI000o00OoI0I && c == '\b' && i == 67))) {
/* 92 */                    return o1ioIIl;
                        }
                    }
/* 96 */            return null;
                }

                public final void I000O01llI0(ArrayList arrayList, int i, KeyEvent keyEvent) {
/* 1 */             boolean zI000o00OoI0I = I000o00OoI0I();
/* 5 */             int modifiers = keyEvent.getModifiers();
/* 11 */            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
/* 20 */            if (keyEvent.getKeyData(keyData) || i == 67) {
/* 25 */                ArrayList arrayList2 = this.I0001Ioi1lo;
/* 27 */                int size = arrayList2.size();
/* 33 */                for (int i2 = 0; i2 < size; i2++) {
/* 39 */                    O1ioIIl o1ioIIl = (O1ioIIl) arrayList2.get(i2);
/* 45 */                    if (o1ioIIl.hasSubMenu()) {
/* 49 */                        o1ioIIl.I000oI1ioi.I000O01llI0(arrayList, i, keyEvent);
                            }
/* 57 */                    char c = zI000o00OoI0I ? o1ioIIl.I000OiO : o1ioIIl.I000O01llI0;
/* 72 */                    if ((modifiers & 69647) == ((zI000o00OoI0I ? o1ioIIl.I000iOII : o1ioIIl.I000OOo1O) & 69647) && c != 0) {
/* 76 */                        char[] cArr = keyData.meta;
/* 80 */                        if ((c == cArr[0] || c == cArr[2] || (zI000o00OoI0I && c == '\b' && i == 67)) && o1ioIIl.isEnabled()) {
/* 101 */                           arrayList.add(o1ioIIl);
                                }
                            }
                        }
                    }
                }

                public final void I000OOo1O() {
/* 1 */             ArrayList arrayListI000l1 = I000l1();
/* 7 */             if (this.I000iOII) {
/* 10 */                CopyOnWriteArrayList copyOnWriteArrayList = this.I001IIilI0O;
/* 12 */                Iterator it = copyOnWriteArrayList.iterator();
/* 17 */                boolean zI0000Il00O = false;
/* 22 */                while (it.hasNext()) {
/* 28 */                    WeakReference weakReference = (WeakReference) it.next();
/* 34 */                    O1l0iiO o1l0iiO = (O1l0iiO) weakReference.get();
/* 36 */                    if (o1l0iiO == null) {
/* 38 */                        copyOnWriteArrayList.remove(weakReference);
                            } else {
/* 46 */                        zI0000Il00O |= o1l0iiO.I0000Il00O();
                            }
                        }
/* 48 */                ArrayList arrayList = this.I000OOo1O;
/* 50 */                ArrayList arrayList2 = this.I000OiO;
/* 52 */                if (zI0000Il00O) {
/* 54 */                    arrayList.clear();
/* 57 */                    arrayList2.clear();
/* 60 */                    int size = arrayListI000l1.size();
/* 65 */                    for (int i = 0; i < size; i++) {
/* 71 */                        O1ioIIl o1ioIIl = (O1ioIIl) arrayListI000l1.get(i);
/* 78 */                        if ((o1ioIIl.I001i1lo1io & 32) == 32) {
/* 80 */                            arrayList.add(o1ioIIl);
                                } else {
/* 84 */                            arrayList2.add(o1ioIIl);
                                }
                            }
                        } else {
/* 90 */                    arrayList.clear();
/* 93 */                    arrayList2.clear();
/* 100 */                   arrayList2.addAll(I000l1());
                        }
/* 103 */               this.I000iOII = false;
                    }
                }

                public String I000OiO() {
/* 1 */             return "android:menu:actionviewstates";
                }

                public final ArrayList I000l1() {
/* 1 */             boolean z = this.I000O01llI0;
/* 3 */             ArrayList arrayList = this.I000II;
/* 5 */             if (!z) {
/* 7 */                 return arrayList;
                    }
/* 8 */             arrayList.clear();
/* 11 */            ArrayList arrayList2 = this.I0001Ioi1lo;
/* 13 */            int size = arrayList2.size();
/* 19 */            for (int i = 0; i < size; i++) {
/* 25 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayList2.get(i);
/* 31 */                if (o1ioIIl.isVisible()) {
/* 33 */                    arrayList.add(o1ioIIl);
                        }
                    }
/* 39 */            this.I000O01llI0 = false;
/* 42 */            this.I000iOII = true;
/* 55 */            return arrayList;
                }

                public boolean I000lI() {
/* 1 */             return this.I001i1O0Ol;
                }

                public boolean I000o00OoI0I() {
/* 1 */             return this.I0000Il00O;
                }

                public boolean I000oI1ioi() {
/* 1 */             return this.I0000O;
                }

                public final void I00100l0(boolean z) {
/* 4 */             if (this.I00100l0) {
/* 60 */                this.I00100o1O0lo = true;
/* 62 */                if (z) {
/* 64 */                    this.I0010I0i = true;
/* 77 */                    return;
                        }
/* 77 */                return;
                    }
/* 6 */             if (z) {
/* 8 */                 this.I000O01llI0 = true;
/* 10 */                this.I000iOII = true;
                    }
/* 12 */            CopyOnWriteArrayList copyOnWriteArrayList = this.I001IIilI0O;
/* 18 */            if (copyOnWriteArrayList.isEmpty()) {
/* 77 */                return;
                    }
/* 21 */            I001i1O0Ol();
/* 24 */            Iterator it = copyOnWriteArrayList.iterator();
/* 32 */            while (it.hasNext()) {
/* 38 */                WeakReference weakReference = (WeakReference) it.next();
/* 44 */                O1l0iiO o1l0iiO = (O1l0iiO) weakReference.get();
/* 46 */                if (o1l0iiO == null) {
/* 48 */                    copyOnWriteArrayList.remove(weakReference);
                        } else {
/* 52 */                    o1l0iiO.I000OOo1O();
                        }
                    }
/* 56 */            I001IO000();
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00100o1O0lo(MenuItem menuItem, O1l0iiO o1l0iiO, int i) {
                    boolean zExpandActionView;
/* 1 */             O1ioIIl o1ioIIl = (O1ioIIl) menuItem;
/* 4 */             if (o1ioIIl == null || !o1ioIIl.isEnabled()) {
/* 3 */                 return false;
                    }
/* 14 */            O1illlIiilIl o1illlIiilIl = o1ioIIl.I000o00OoI0I;
/* 16 */            MenuItem.OnMenuItemClickListener onMenuItemClickListener = o1ioIIl.I00100l0;
/* 19 */            if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(o1ioIIl)) && !o1illlIiilIl.I0000oI00(o1illlIiilIl, o1ioIIl)) {
/* 36 */                Intent intent = o1ioIIl.I000II;
/* 38 */                if (intent != null) {
                            try {
/* 42 */                        o1illlIiilIl.I00000oIO.startActivity(intent);
                            } catch (ActivityNotFoundException e) {
/* 51 */                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                            }
                        } else {
/* 54 */                    O1ioO0 o1ioO0 = o1ioIIl.I001lIiIIo1O;
/* 67 */                    zExpandActionView = o1ioO0 != null && o1ioO0.I00000oOI.onPerformDefaultAction();
                        }
                    }
/* 68 */            O1ioO0 o1ioO02 = o1ioIIl.I001lIiIIo1O;
/* 82 */            boolean z = o1ioO02 != null && o1ioO02.I00000oOI.hasSubMenu();
/* 87 */            if (o1ioIIl.I0000oI00()) {
/* 93 */                zExpandActionView |= o1ioIIl.expandActionView();
/* 94 */                if (zExpandActionView) {
/* 96 */                    I0000Il00O(true);
                        }
                    } else if (o1ioIIl.hasSubMenu() || z) {
/* 120 */               if ((i & 4) == 0) {
/* 122 */                   I0000Il00O(false);
                        }
/* 129 */               if (!o1ioIIl.hasSubMenu()) {
/* 135 */                   Oli1l1l0 oli1l1l0 = new Oli1l1l0(this.I00000oIO, this, o1ioIIl);
/* 138 */                   o1ioIIl.I000oI1ioi = oli1l1l0;
/* 142 */                   oli1l1l0.setHeaderTitle(o1ioIIl.I0000oI00);
                        }
/* 145 */               Oli1l1l0 oli1l1l02 = o1ioIIl.I000oI1ioi;
/* 147 */               if (z) {
/* 151 */                   o1ioO02.I00000oOI.onPrepareSubMenu(oli1l1l02);
                        }
/* 154 */               CopyOnWriteArrayList copyOnWriteArrayList = this.I001IIilI0O;
/* 160 */               if (!copyOnWriteArrayList.isEmpty()) {
/* 165 */                   zI00000oOI = o1l0iiO != null ? o1l0iiO.I00000oOI(oli1l1l02) : false;
/* 169 */                   Iterator it = copyOnWriteArrayList.iterator();
/* 177 */                   while (it.hasNext()) {
/* 183 */                       WeakReference weakReference = (WeakReference) it.next();
/* 189 */                       O1l0iiO o1l0iiO2 = (O1l0iiO) weakReference.get();
/* 191 */                       if (o1l0iiO2 == null) {
/* 193 */                           copyOnWriteArrayList.remove(weakReference);
                                } else if (!zI00000oOI) {
/* 199 */                           zI00000oOI = o1l0iiO2.I00000oOI(oli1l1l02);
                                }
                            }
                        }
/* 204 */               zExpandActionView |= zI00000oOI;
/* 205 */               if (!zExpandActionView) {
/* 207 */                   I0000Il00O(true);
                        }
                    } else if ((i & 1) == 0) {
/* 114 */               I0000Il00O(true);
                    }
/* 210 */           return zExpandActionView;
                }

                public final void I0010I0i(O1l0iiO o1l0iiO) {
/* 1 */             CopyOnWriteArrayList copyOnWriteArrayList = this.I001IIilI0O;
/* 3 */             Iterator it = copyOnWriteArrayList.iterator();
/* 11 */            while (it.hasNext()) {
/* 17 */                WeakReference weakReference = (WeakReference) it.next();
/* 23 */                O1l0iiO o1l0iiO2 = (O1l0iiO) weakReference.get();
/* 25 */                if (o1l0iiO2 == null || o1l0iiO2 == o1l0iiO) {
/* 29 */                    copyOnWriteArrayList.remove(weakReference);
                        }
                    }
                }

                public final void I0010o(Bundle bundle) {
                    MenuItem menuItemFindItem;
/* 1 */             if (bundle == null) {
/* 77 */                return;
                    }
/* 8 */             SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(I000OiO());
/* 14 */            int size = this.I0001Ioi1lo.size();
/* 19 */            for (int i = 0; i < size; i++) {
/* 21 */                MenuItem item = getItem(i);
/* 25 */                View actionView = item.getActionView();
/* 29 */                if (actionView != null && actionView.getId() != -1) {
/* 38 */                    actionView.restoreHierarchyState(sparseParcelableArray);
                        }
/* 45 */                if (item.hasSubMenu()) {
/* 53 */                    ((Oli1l1l0) item.getSubMenu()).I0010o(bundle);
                        }
                    }
/* 61 */            int i2 = bundle.getInt("android:menu:expandedactionview");
/* 65 */            if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
/* 77 */                return;
                    }
/* 73 */            menuItemFindItem.expandActionView();
                }

                public final void I00111O(Bundle bundle) {
/* 3 */             int size = this.I0001Ioi1lo.size();
/* 7 */             SparseArray<? extends Parcelable> sparseArray = null;
/* 9 */             for (int i = 0; i < size; i++) {
/* 11 */                MenuItem item = getItem(i);
/* 15 */                View actionView = item.getActionView();
/* 19 */                if (actionView != null && actionView.getId() != -1) {
/* 28 */                    if (sparseArray == null) {
/* 32 */                        sparseArray = new SparseArray<>();
                            }
/* 35 */                    actionView.saveHierarchyState(sparseArray);
/* 42 */                    if (item.isActionViewExpanded()) {
/* 50 */                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                            }
                        }
/* 57 */                if (item.hasSubMenu()) {
/* 65 */                    ((Oli1l1l0) item.getSubMenu()).I00111O(bundle);
                        }
                    }
/* 71 */            if (sparseArray != null) {
/* 77 */                bundle.putSparseParcelableArray(I000OiO(), sparseArray);
                    }
                }

                public final void I001IIilI0O(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
/* 2 */             if (view != null) {
/* 4 */                 this.I000oI1ioi = view;
/* 6 */                 this.I000lI = null;
/* 8 */                 this.I000o00OoI0I = null;
                    } else {
/* 11 */                if (i > 0) {
/* 19 */                    this.I000lI = this.I00000oOI.getText(i);
                        } else if (charSequence != null) {
/* 24 */                    this.I000lI = charSequence;
                        }
/* 26 */                if (i2 > 0) {
/* 34 */                    this.I000o00OoI0I = this.I00000oIO.getDrawable(i2);
                        } else if (drawable != null) {
/* 39 */                    this.I000o00OoI0I = drawable;
                        }
/* 41 */                this.I000oI1ioi = null;
                    }
/* 44 */            I00100l0(false);
                }

                public final void I001IO000() {
/* 2 */             this.I00100l0 = false;
/* 6 */             if (this.I00100o1O0lo) {
/* 8 */                 this.I00100o1O0lo = false;
/* 12 */                I00100l0(this.I0010I0i);
                    }
                }

                public final void I001i1O0Ol() {
/* 3 */             if (this.I00100l0) {
/* 20 */                return;
                    }
/* 6 */             this.I00100l0 = true;
/* 9 */             this.I00100o1O0lo = false;
/* 11 */            this.I0010I0i = false;
                }

                @Override
                public final MenuItem add(int i) {
/* 8 */             return I00000oIO(0, 0, 0, this.I00000oOI.getString(i));
                }

                @Override
                public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
                    int i5;
/* 3 */             PackageManager packageManager = this.I00000oIO.getPackageManager();
/* 8 */             List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
/* 19 */            int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
/* 22 */            if ((i4 & 1) == 0) {
/* 24 */                removeGroup(i);
                    }
/* 27 */            for (int i6 = 0; i6 < size; i6++) {
/* 29 */                ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
/* 37 */                int i7 = resolveInfo.specificIndex;
/* 45 */                Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
/* 50 */                ActivityInfo activityInfo = resolveInfo.activityInfo;
/* 61 */                intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
/* 68 */                O1ioIIl o1ioIIlI00000oIO = I00000oIO(i, i2, i3, resolveInfo.loadLabel(packageManager));
/* 76 */                o1ioIIlI00000oIO.setIcon(resolveInfo.loadIcon(packageManager));
/* 79 */                o1ioIIlI00000oIO.I000II = intent2;
/* 81 */                if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
/* 87 */                    menuItemArr[i5] = o1ioIIlI00000oIO;
                        }
                    }
/* 1750 */          return size;
                }

                @Override
                public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
/* 1 */             O1ioIIl o1ioIIlI00000oIO = I00000oIO(i, i2, i3, charSequence);
/* 9 */             Oli1l1l0 oli1l1l0 = new Oli1l1l0(this.I00000oIO, this, o1ioIIlI00000oIO);
/* 12 */            o1ioIIlI00000oIO.I000oI1ioi = oli1l1l0;
/* 16 */            oli1l1l0.setHeaderTitle(o1ioIIlI00000oIO.I0000oI00);
/* 204 */           return oli1l1l0;
                }

                @Override
                public final void clear() {
/* 1 */             O1ioIIl o1ioIIl = this.I001IO000;
/* 3 */             if (o1ioIIl != null) {
/* 5 */                 I0000O(o1ioIIl);
                    }
/* 10 */            this.I0001Ioi1lo.clear();
/* 14 */            I00100l0(true);
                }

                public final void clearHeader() {
/* 2 */             this.I000o00OoI0I = null;
/* 4 */             this.I000lI = null;
/* 6 */             this.I000oI1ioi = null;
/* 9 */             I00100l0(false);
                }

                @Override
                public final void close() {
/* 2 */             I0000Il00O(true);
                }

                @Override
                public final MenuItem findItem(int i) {
                    MenuItem menuItemFindItem;
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i2 = 0; i2 < size; i2++) {
/* 14 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayList.get(i2);
/* 18 */                if (o1ioIIl.I00000oIO == i) {
/* 20 */                    return o1ioIIl;
                        }
/* 25 */                if (o1ioIIl.hasSubMenu() && (menuItemFindItem = o1ioIIl.I000oI1ioi.findItem(i)) != null) {
/* 35 */                    return menuItemFindItem;
                        }
                    }
/* 39 */            return null;
                }

                @Override
                public final MenuItem getItem(int i) {
/* 7 */             return (MenuItem) this.I0001Ioi1lo.get(i);
                }

                @Override
                public final boolean hasVisibleItems() {
/* 3 */             if (this.I001i1lo1io) {
/* 28 */                return true;
                    }
/* 6 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 8 */             int size = arrayList.size();
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                if (((O1ioIIl) arrayList.get(i)).isVisible()) {
/* 28 */                    return true;
                        }
                    }
/* 12 */            return false;
                }

                @Override
                public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
                    return I000II(i, keyEvent) != null;
                }

                @Override
                public final boolean performIdentifierAction(int i, int i2) {
/* 6 */             return I00100o1O0lo(findItem(i), null, i2);
                }

                @Override
                public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
/* 1 */             O1ioIIl o1ioIIlI000II = I000II(i, keyEvent);
/* 13 */            boolean zI00100o1O0lo = o1ioIIlI000II != null ? I00100o1O0lo(o1ioIIlI000II, null, i2) : false;
/* 16 */            if ((i2 & 2) != 0) {
/* 19 */                I0000Il00O(true);
                    }
/* 98 */            return zI00100o1O0lo;
                }

                @Override
                public final void removeGroup(int i) {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             int size = arrayList.size();
/* 7 */             int i2 = 0;
/* 8 */             int i3 = 0;
                    while (true) {
/* 9 */                 if (i3 >= size) {
/* 25 */                    i3 = -1;
                            break;
                        } else if (((O1ioIIl) arrayList.get(i3)).I00000oOI == i) {
                            break;
                        } else {
/* 22 */                    i3++;
                        }
                    }
/* 26 */            if (i3 >= 0) {
/* 32 */                int size2 = arrayList.size() - i3;
                        while (true) {
/* 33 */                    int i4 = i2 + 1;
/* 35 */                    if (i2 >= size2 || ((O1ioIIl) arrayList.get(i3)).I00000oOI != i) {
                                break;
                            }
/* 47 */                    if (i3 >= 0 && i3 < arrayList.size()) {
/* 56 */                        arrayList.remove(i3);
                            }
/* 59 */                    i2 = i4;
                        }
/* 62 */                I00100l0(true);
                    }
                }

                @Override
                public final void removeItem(int i) {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             int size = arrayList.size();
/* 7 */             int i2 = 0;
                    while (true) {
/* 8 */                 if (i2 >= size) {
/* 24 */                    i2 = -1;
                            break;
                        } else if (((O1ioIIl) arrayList.get(i2)).I00000oIO == i) {
                            break;
                        } else {
/* 21 */                    i2++;
                        }
                    }
/* 25 */            if (i2 < 0 || i2 >= arrayList.size()) {
/* 77 */                return;
                    }
/* 34 */            arrayList.remove(i2);
/* 38 */            I00100l0(true);
                }

                @Override
                public final void setGroupCheckable(int i, boolean z, boolean z2) {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             int size = arrayList.size();
/* 9 */             for (int i2 = 0; i2 < size; i2++) {
/* 15 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayList.get(i2);
/* 19 */                if (o1ioIIl.I00000oOI == i) {
/* 31 */                    o1ioIIl.I001i1lo1io = (o1ioIIl.I001i1lo1io & (-5)) | (z2 ? 4 : 0);
/* 33 */                    o1ioIIl.setCheckable(z);
                        }
                    }
                }

                @Override
                public void setGroupDividerEnabled(boolean z) {
/* 1 */             this.I001i1O0Ol = z;
                }

                @Override
                public final void setGroupEnabled(int i, boolean z) {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i2 = 0; i2 < size; i2++) {
/* 14 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayList.get(i2);
/* 18 */                if (o1ioIIl.I00000oOI == i) {
/* 20 */                    o1ioIIl.setEnabled(z);
                        }
                    }
                }

                @Override
                public final void setGroupVisible(int i, boolean z) {
/* 1 */             ArrayList arrayList = this.I0001Ioi1lo;
/* 3 */             int size = arrayList.size();
/* 9 */             boolean z2 = false;
/* 11 */            for (int i2 = 0; i2 < size; i2++) {
/* 17 */                O1ioIIl o1ioIIl = (O1ioIIl) arrayList.get(i2);
/* 21 */                if (o1ioIIl.I00000oOI == i) {
/* 23 */                    int i3 = o1ioIIl.I001i1lo1io;
/* 33 */                    int i4 = (i3 & (-9)) | (z ? 0 : 8);
/* 34 */                    o1ioIIl.I001i1lo1io = i4;
/* 36 */                    if (i3 != i4) {
/* 38 */                        z2 = true;
                            }
                        }
                    }
/* 42 */            if (z2) {
/* 44 */                I00100l0(true);
                    }
                }

                @Override
                public void setQwertyMode(boolean z) {
/* 1 */             this.I0000Il00O = z;
/* 4 */             I00100l0(false);
                }

                @Override
                public final int size() {
/* 3 */             return this.I0001Ioi1lo.size();
                }

                @Override
/* 12 */        public final MenuItem add(CharSequence charSequence) {
/* 13 */            return I00000oIO(0, 0, 0, charSequence);
                }

                @Override
/* 13 */        public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
/* 14 */            return I00000oIO(i, i2, i3, charSequence);
                }

                @Override
/* 14 */        public final MenuItem add(int i, int i2, int i3, int i4) {
/* 15 */            return I00000oIO(i, i2, i3, this.I00000oOI.getString(i4));
                }

/* 19 */        public O1illlIiilIl I000iOII() {
/* 20 */            return this;
                }

                @Override
/* 19 */        public final SubMenu addSubMenu(int i) {
/* 20 */            return addSubMenu(0, 0, 0, this.I00000oOI.getString(i));
                }

                @Override
/* 20 */        public final SubMenu addSubMenu(CharSequence charSequence) {
/* 21 */            return addSubMenu(0, 0, 0, charSequence);
                }

                @Override
/* 21 */        public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
/* 22 */            return addSubMenu(i, i2, i3, this.I00000oOI.getString(i4));
                }
            }
