            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.SubMenu;
            
/* 7 */     public class O1l0oO1I0iO extends I01loIooI implements Menu {
                public final O1illlIiilIl I0000Il00O;

                public O1l0oO1I0iO(Context context, O1illlIiilIl o1illlIiilIl) {
/* 1 */             super(context);
/* 4 */             if (o1illlIiilIl != null) {
/* 6 */                 this.I0000Il00O = o1illlIiilIl;
                    } else {
/* 11 */                I000II.I000iOII("Wrapped Object can not be null.");
/* 37 */                throw null;
                    }
                }

                @Override
                public final MenuItem add(CharSequence charSequence) {
/* 8 */             return I000lI(this.I0000Il00O.I00000oIO(0, 0, 0, charSequence));
                }

                @Override
                public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
/* 10 */            MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
/* 24 */            int iAddIntentOptions = this.I0000Il00O.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
/* 28 */            if (menuItemArr2 != null) {
/* 30 */                int length = menuItemArr2.length;
/* 32 */                for (int i5 = 0; i5 < length; i5++) {
/* 40 */                    menuItemArr[i5] = I000lI(menuItemArr2[i5]);
                        }
                    }
/* 1750 */          return iAddIntentOptions;
                }

                @Override
                public final SubMenu addSubMenu(CharSequence charSequence) {
/* 4 */             return this.I0000Il00O.addSubMenu(0, 0, 0, charSequence);
                }

                @Override
                public final void clear() {
/* 3 */             Ol0Ii10o1 ol0Ii10o1 = (Ol0Ii10o1) this.I00000oOI;
/* 5 */             if (ol0Ii10o1 != null) {
/* 7 */                 ol0Ii10o1.clear();
                    }
/* 12 */            this.I0000Il00O.clear();
                }

                @Override
                public final void close() {
/* 3 */             this.I0000Il00O.close();
                }

                @Override
                public final MenuItem findItem(int i) {
/* 7 */             return I000lI(this.I0000Il00O.findItem(i));
                }

                @Override
                public final MenuItem getItem(int i) {
/* 7 */             return I000lI(this.I0000Il00O.getItem(i));
                }

                @Override
                public final boolean hasVisibleItems() {
/* 3 */             return this.I0000Il00O.hasVisibleItems();
                }

                @Override
                public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
/* 3 */             return this.I0000Il00O.isShortcutKey(i, keyEvent);
                }

                @Override
                public final boolean performIdentifierAction(int i, int i2) {
/* 3 */             return this.I0000Il00O.performIdentifierAction(i, i2);
                }

                @Override
                public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
/* 3 */             return this.I0000Il00O.performShortcut(i, keyEvent, i2);
                }

                @Override
                public final void removeGroup(int i) {
/* 5 */             if (((Ol0Ii10o1) this.I00000oOI) != null) {
/* 8 */                 int i2 = 0;
                        while (true) {
/* 11 */                    Ol0Ii10o1 ol0Ii10o1 = (Ol0Ii10o1) this.I00000oOI;
/* 15 */                    if (i2 >= ol0Ii10o1.I00iiO) {
                                break;
                            }
/* 27 */                    if (((OliiollI) ol0Ii10o1.I000II(i2)).getGroupId() == i) {
/* 33 */                        ((Ol0Ii10o1) this.I00000oOI).I000O01llI0(i2);
                                i2--;
                            }
/* 38 */                    i2++;
                        }
                    }
/* 43 */            this.I0000Il00O.removeGroup(i);
                }

                @Override
                public final void removeItem(int i) {
/* 5 */             if (((Ol0Ii10o1) this.I00000oOI) != null) {
/* 8 */                 int i2 = 0;
                        while (true) {
/* 11 */                    Ol0Ii10o1 ol0Ii10o1 = (Ol0Ii10o1) this.I00000oOI;
/* 15 */                    if (i2 >= ol0Ii10o1.I00iiO) {
                                break;
                            }
/* 27 */                    if (((OliiollI) ol0Ii10o1.I000II(i2)).getItemId() == i) {
/* 33 */                        ((Ol0Ii10o1) this.I00000oOI).I000O01llI0(i2);
                                break;
                            }
/* 37 */                    i2++;
                        }
                    }
/* 42 */            this.I0000Il00O.removeItem(i);
                }

                @Override
                public final void setGroupCheckable(int i, boolean z, boolean z2) {
/* 3 */             this.I0000Il00O.setGroupCheckable(i, z, z2);
                }

                @Override
                public final void setGroupEnabled(int i, boolean z) {
/* 3 */             this.I0000Il00O.setGroupEnabled(i, z);
                }

                @Override
                public final void setGroupVisible(int i, boolean z) {
/* 3 */             this.I0000Il00O.setGroupVisible(i, z);
                }

                @Override
                public final void setQwertyMode(boolean z) {
/* 3 */             this.I0000Il00O.setQwertyMode(z);
                }

                @Override
                public final int size() {
/* 5 */             return this.I0000Il00O.I0001Ioi1lo.size();
                }

                @Override
/* 8 */         public final SubMenu addSubMenu(int i) {
/* 9 */             return this.I0000Il00O.addSubMenu(i);
                }

                @Override
/* 9 */         public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
/* 10 */            return this.I0000Il00O.addSubMenu(i, i2, i3, charSequence);
                }

                @Override
/* 10 */        public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
/* 12 */            return this.I0000Il00O.addSubMenu(i, i2, i3, i4);
                }

                @Override
/* 12 */        public final MenuItem add(int i) {
/* 13 */            return I000lI(this.I0000Il00O.add(i));
                }

                @Override
/* 13 */        public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
/* 16 */            return I000lI(this.I0000Il00O.I00000oIO(i, i2, i3, charSequence));
                }

                @Override
/* 16 */        public final MenuItem add(int i, int i2, int i3, int i4) {
/* 17 */            return I000lI(this.I0000Il00O.add(i, i2, i3, i4));
                }
            }
