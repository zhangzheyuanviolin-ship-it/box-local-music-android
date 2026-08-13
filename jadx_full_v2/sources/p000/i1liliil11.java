            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
/* 24 */    public class i1liliil11 extends AbstractCollection implements List {
                public final int I00iOIl = 0;
                public final Object I00iiI;
                public Collection I00iiO;
                public final Collection I00iio;
                public final AbstractCollection I00ilI0I1;
                public final Serializable I00ilO0;
                public final Serializable I00io1l;

                public i1liliil11(iI1oliOIO ii1olioio, Object obj, List list, i1liliil11 i1liliil11Var) {
/* 4 */             this.I00io1l = ii1olioio;
/* 6 */             this.I00ilO0 = ii1olioio;
/* 11 */            this.I00iiI = obj;
/* 13 */            this.I00iiO = list;
/* 15 */            this.I00ilI0I1 = i1liliil11Var;
/* 23 */            this.I00iio = i1liliil11Var == null ? null : i1liliil11Var.I00iiO;
                }

                public final void I00000oOI() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
/* 5 */             Serializable serializable = this.I00ilO0;
/* 7 */             AbstractCollection abstractCollection = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 156 */                   i1liliil11 i1liliil11Var = (i1liliil11) abstractCollection;
/* 158 */                   if (i1liliil11Var == null) {
/* 170 */                       if (this.I00iiO.isEmpty()) {
/* 176 */                           ((iI1oliOIO) serializable).I00iiO.remove(obj);
                                    break;
                                }
                            } else {
/* 160 */                       i1liliil11Var.I00000oOI();
                                break;
                            }
                            break;
                        case 1:
/* 132 */                   i1liliil11 i1liliil11Var2 = (i1liliil11) abstractCollection;
/* 134 */                   if (i1liliil11Var2 == null) {
/* 146 */                       if (this.I00iiO.isEmpty()) {
/* 152 */                           ((iO0OOlIoo00) serializable).I00iiO.remove(obj);
                                    break;
                                }
                            } else {
/* 136 */                       i1liliil11Var2.I00000oOI();
                                break;
                            }
                            break;
                        case 2:
/* 108 */                   i1liliil11 i1liliil11Var3 = (i1liliil11) abstractCollection;
/* 110 */                   if (i1liliil11Var3 == null) {
/* 122 */                       if (this.I00iiO.isEmpty()) {
/* 128 */                           ((iOIoo1lI) serializable).I00iiO.remove(obj);
                                    break;
                                }
                            } else {
/* 112 */                       i1liliil11Var3.I00000oOI();
                                break;
                            }
                            break;
                        case 3:
/* 84 */                    i1liliil11 i1liliil11Var4 = (i1liliil11) abstractCollection;
/* 86 */                    if (i1liliil11Var4 == null) {
/* 98 */                        if (this.I00iiO.isEmpty()) {
/* 104 */                           ((iii1IlooII) serializable).I00iio.remove(obj);
                                    break;
                                }
                            } else {
/* 88 */                        i1liliil11Var4.I00000oOI();
                                break;
                            }
                            break;
                        case 4:
/* 60 */                    i1liliil11 i1liliil11Var5 = (i1liliil11) abstractCollection;
/* 62 */                    if (i1liliil11Var5 == null) {
/* 74 */                        if (this.I00iiO.isEmpty()) {
/* 80 */                            ((loO1I0) serializable).I00iiO.remove(obj);
                                    break;
                                }
                            } else {
/* 64 */                        i1liliil11Var5.I00000oOI();
                                break;
                            }
                            break;
                        case 5:
/* 36 */                    i1liliil11 i1liliil11Var6 = (i1liliil11) abstractCollection;
/* 38 */                    if (i1liliil11Var6 == null) {
/* 50 */                        if (this.I00iiO.isEmpty()) {
/* 56 */                            ((o10liooI) serializable).I00iiO.remove(obj);
                                    break;
                                }
                            } else {
/* 40 */                        i1liliil11Var6.I00000oOI();
                                break;
                            }
                            break;
                        default:
/* 12 */                    i1liliil11 i1liliil11Var7 = (i1liliil11) abstractCollection;
/* 14 */                    if (i1liliil11Var7 == null) {
/* 26 */                        if (this.I00iiO.isEmpty()) {
/* 32 */                            ((o10lo0) serializable).I00iiO.remove(obj);
                                    break;
                                }
                            } else {
/* 16 */                        i1liliil11Var7.I00000oOI();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final boolean add(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 173 */                   zzb();
/* 178 */                   boolean zIsEmpty = this.I00iiO.isEmpty();
/* 184 */                   boolean zAdd = this.I00iiO.add(obj);
/* 188 */                   if (!zAdd || !zIsEmpty) {
/* 196 */                       return zAdd;
                            }
/* 192 */                   zza();
/* 5 */                     return true;
                        case 1:
/* 148 */                   zzb();
/* 153 */                   boolean zIsEmpty2 = this.I00iiO.isEmpty();
/* 159 */                   boolean zAdd2 = this.I00iiO.add(obj);
/* 163 */                   if (!zAdd2 || !zIsEmpty2) {
/* 171 */                       return zAdd2;
                            }
/* 167 */                   zza();
/* 5 */                     return true;
                        case 2:
/* 116 */                   zzb();
/* 121 */                   boolean zIsEmpty3 = this.I00iiO.isEmpty();
/* 127 */                   boolean zAdd3 = this.I00iiO.add(obj);
/* 131 */                   if (zAdd3) {
                                ((iOIoo1lI) serializable).I00iio++;
/* 140 */                       if (zIsEmpty3) {
/* 142 */                           zza();
/* 5 */                             return true;
                                }
                            }
/* 146 */                   return zAdd3;
                        case 3:
/* 84 */                    zzb();
/* 89 */                    boolean zIsEmpty4 = this.I00iiO.isEmpty();
/* 95 */                    boolean zAdd4 = this.I00iiO.add(obj);
/* 99 */                    if (zAdd4) {
                                ((iii1IlooII) serializable).I00ilI0I1++;
/* 108 */                       if (zIsEmpty4) {
/* 110 */                           zza();
/* 5 */                             return true;
                                }
                            }
/* 114 */                   return zAdd4;
                        case 4:
/* 59 */                    zzb();
/* 64 */                    boolean zIsEmpty5 = this.I00iiO.isEmpty();
/* 70 */                    boolean zAdd5 = this.I00iiO.add(obj);
/* 74 */                    if (!zAdd5 || !zIsEmpty5) {
/* 82 */                        return zAdd5;
                            }
/* 78 */                    zza();
/* 5 */                     return true;
                        case 5:
/* 34 */                    zzb();
/* 39 */                    boolean zIsEmpty6 = this.I00iiO.isEmpty();
/* 45 */                    boolean zAdd6 = this.I00iiO.add(obj);
/* 49 */                    if (!zAdd6 || !zIsEmpty6) {
/* 57 */                        return zAdd6;
                            }
/* 53 */                    zza();
/* 5 */                     return true;
                        default:
/* 9 */                     zzb();
/* 14 */                    boolean zIsEmpty7 = this.I00iiO.isEmpty();
/* 20 */                    boolean zAdd7 = this.I00iiO.add(obj);
/* 24 */                    if (!zAdd7 || !zIsEmpty7) {
/* 32 */                        return zAdd7;
                            }
/* 28 */                    zza();
/* 5 */                     return true;
                    }
                }

                @Override
                public final boolean addAll(int i, Collection collection) {
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00io1l;
                    switch (i2) {
                        case 0:
/* 242 */                   if (collection.isEmpty()) {
/* 6 */                         return false;
                            }
/* 246 */                   int size = size();
/* 254 */                   boolean zAddAll = ((List) this.I00iiO).addAll(i, collection);
/* 258 */                   if (zAddAll) {
/* 262 */                       this.I00iiO.size();
/* 265 */                       if (size == 0) {
/* 267 */                           zza();
/* 5 */                             return true;
                                }
                            }
/* 271 */                   return zAddAll;
                        case 1:
/* 207 */                   if (collection.isEmpty()) {
/* 6 */                         return false;
                            }
/* 211 */                   int size2 = size();
/* 219 */                   boolean zAddAll2 = ((List) this.I00iiO).addAll(i, collection);
/* 223 */                   if (zAddAll2) {
/* 227 */                       this.I00iiO.size();
/* 230 */                       if (size2 == 0) {
/* 232 */                           zza();
/* 5 */                             return true;
                                }
                            }
/* 236 */                   return zAddAll2;
                        case 2:
/* 163 */                   if (collection.isEmpty()) {
/* 6 */                         return false;
                            }
/* 167 */                   int size3 = size();
/* 175 */                   boolean zAddAll3 = ((List) this.I00iiO).addAll(i, collection);
/* 179 */                   if (zAddAll3) {
                                ((iOIoo1lI) serializable).I00iio += this.I00iiO.size() - size3;
/* 195 */                       if (size3 == 0) {
/* 197 */                           zza();
/* 5 */                             return true;
                                }
                            }
/* 201 */                   return zAddAll3;
                        case 3:
/* 119 */                   if (collection.isEmpty()) {
/* 6 */                         return false;
                            }
/* 123 */                   int size4 = size();
/* 131 */                   boolean zAddAll4 = ((List) this.I00iiO).addAll(i, collection);
/* 135 */                   if (zAddAll4) {
                                ((iii1IlooII) serializable).I00ilI0I1 += this.I00iiO.size() - size4;
/* 151 */                       if (size4 == 0) {
/* 153 */                           zza();
/* 5 */                             return true;
                                }
                            }
/* 157 */                   return zAddAll4;
                        case 4:
/* 84 */                    if (collection.isEmpty()) {
/* 6 */                         return false;
                            }
/* 88 */                    int size5 = size();
/* 96 */                    boolean zAddAll5 = ((List) this.I00iiO).addAll(i, collection);
/* 100 */                   if (zAddAll5) {
/* 104 */                       this.I00iiO.size();
/* 107 */                       if (size5 == 0) {
/* 109 */                           zza();
/* 5 */                             return true;
                                }
                            }
/* 113 */                   return zAddAll5;
                        case 5:
/* 49 */                    if (collection.isEmpty()) {
/* 6 */                         return false;
                            }
/* 53 */                    int size6 = size();
/* 61 */                    boolean zAddAll6 = ((List) this.I00iiO).addAll(i, collection);
/* 65 */                    if (zAddAll6) {
/* 69 */                        this.I00iiO.size();
/* 72 */                        if (size6 == 0) {
/* 74 */                            zza();
/* 5 */                             return true;
                                }
                            }
/* 78 */                    return zAddAll6;
                        default:
/* 14 */                    if (collection.isEmpty()) {
/* 6 */                         return false;
                            }
/* 18 */                    int size7 = size();
/* 26 */                    boolean zAddAll7 = ((List) this.I00iiO).addAll(i, collection);
/* 30 */                    if (zAddAll7) {
/* 34 */                        this.I00iiO.size();
/* 37 */                        if (size7 == 0) {
/* 39 */                            zza();
/* 5 */                             return true;
                                }
                            }
/* 43 */                    return zAddAll7;
                    }
                }

                @Override
                public final void clear() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 122 */                   if (size() != 0) {
/* 127 */                       this.I00iiO.clear();
/* 130 */                       I00000oOI();
                                break;
                            }
                            break;
                        case 1:
/* 106 */                   if (size() != 0) {
/* 111 */                       this.I00iiO.clear();
/* 114 */                       I00000oOI();
                                break;
                            }
                            break;
                        case 2:
/* 79 */                    int size = size();
/* 83 */                    if (size != 0) {
/* 88 */                        this.I00iiO.clear();
                                ((iOIoo1lI) serializable).I00iio -= size;
/* 98 */                        I00000oOI();
                                break;
                            }
                            break;
                        case 3:
/* 56 */                    int size2 = size();
/* 60 */                    if (size2 != 0) {
/* 65 */                        this.I00iiO.clear();
                                ((iii1IlooII) serializable).I00ilI0I1 -= size2;
/* 75 */                        I00000oOI();
                                break;
                            }
                            break;
                        case 4:
/* 44 */                    if (size() != 0) {
/* 49 */                        this.I00iiO.clear();
/* 52 */                        I00000oOI();
                                break;
                            }
                            break;
                        case 5:
/* 28 */                    if (size() != 0) {
/* 33 */                        this.I00iiO.clear();
/* 36 */                        I00000oOI();
                                break;
                            }
                            break;
                        default:
/* 12 */                    if (size() != 0) {
/* 17 */                        this.I00iiO.clear();
/* 20 */                        I00000oOI();
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final boolean contains(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 66 */                    zzb();
                            break;
                        case 1:
/* 56 */                    zzb();
                            break;
                        case 2:
/* 46 */                    zzb();
                            break;
                        case 3:
/* 36 */                    zzb();
                            break;
                        case 4:
/* 26 */                    zzb();
                            break;
                        case 5:
/* 16 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 11 */            return this.I00iiO.contains(obj);
                }

                @Override
                public final boolean containsAll(Collection collection) {
                    switch (this.I00iOIl) {
                        case 0:
/* 66 */                    zzb();
                            break;
                        case 1:
/* 56 */                    zzb();
                            break;
                        case 2:
/* 46 */                    zzb();
                            break;
                        case 3:
/* 36 */                    zzb();
                            break;
                        case 4:
/* 26 */                    zzb();
                            break;
                        case 5:
/* 16 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 11 */            return this.I00iiO.containsAll(collection);
                }

                @Override
                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 90 */                    if (obj != this) {
/* 94 */                        zzb();
                                break;
                            }
                            break;
                        case 1:
/* 76 */                    if (obj != this) {
/* 80 */                        zzb();
                                break;
                            }
                            break;
                        case 2:
/* 62 */                    if (obj != this) {
/* 66 */                        zzb();
                                break;
                            }
                            break;
                        case 3:
/* 48 */                    if (obj != this) {
/* 52 */                        zzb();
                                break;
                            }
                            break;
                        case 4:
/* 34 */                    if (obj != this) {
/* 38 */                        zzb();
                                break;
                            }
                            break;
                        case 5:
/* 20 */                    if (obj != this) {
/* 24 */                        zzb();
                                break;
                            }
                            break;
                        default:
/* 6 */                     if (obj != this) {
/* 10 */                        zzb();
                                break;
                            }
                            break;
                    }
/* 15 */            return this.I00iiO.equals(obj);
                }

                @Override
                public final Object get(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 78 */                    zzb();
                            break;
                        case 1:
/* 66 */                    zzb();
                            break;
                        case 2:
/* 54 */                    zzb();
                            break;
                        case 3:
/* 42 */                    zzb();
                            break;
                        case 4:
/* 30 */                    zzb();
                            break;
                        case 5:
/* 18 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 13 */            return ((List) this.I00iiO).get(i);
                }

                @Override
                public final int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 66 */                    zzb();
                            break;
                        case 1:
/* 56 */                    zzb();
                            break;
                        case 2:
/* 46 */                    zzb();
                            break;
                        case 3:
/* 36 */                    zzb();
                            break;
                        case 4:
/* 26 */                    zzb();
                            break;
                        case 5:
/* 16 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 11 */            return this.I00iiO.hashCode();
                }

                @Override
                public final int indexOf(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 78 */                    zzb();
                            break;
                        case 1:
/* 66 */                    zzb();
                            break;
                        case 2:
/* 54 */                    zzb();
                            break;
                        case 3:
/* 42 */                    zzb();
                            break;
                        case 4:
/* 30 */                    zzb();
                            break;
                        case 5:
/* 18 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 13 */            return ((List) this.I00iiO).indexOf(obj);
                }

                @Override
                public final Iterator iterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 67 */                    zzb();
/* 72 */                    return new OIlo1IOiO0i(this);
                        case 1:
/* 57 */                    zzb();
/* 63 */                    return new OIlo1IOiO0i(this, (byte) 0);
                        case 2:
/* 47 */                    zzb();
/* 53 */                    return new OIlo1IOiO0i(this, (char) 0);
                        case 3:
/* 37 */                    zzb();
/* 43 */                    return new OIlo1IOiO0i(this, 0);
                        case 4:
/* 27 */                    zzb();
/* 33 */                    return new OIlo1IOiO0i(this, (short) 0);
                        case 5:
/* 16 */                    zzb();
/* 23 */                    return new OIlo1IOiO0i(this, (byte) 0, false);
                        default:
/* 6 */                     zzb();
/* 12 */                    return new OIlo1IOiO0i(this, (byte) 0, (byte) 0);
                    }
                }

                @Override
                public final int lastIndexOf(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 78 */                    zzb();
                            break;
                        case 1:
/* 66 */                    zzb();
                            break;
                        case 2:
/* 54 */                    zzb();
                            break;
                        case 3:
/* 42 */                    zzb();
                            break;
                        case 4:
/* 30 */                    zzb();
                            break;
                        case 5:
/* 18 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 13 */            return ((List) this.I00iiO).lastIndexOf(obj);
                }

                @Override
                public final ListIterator listIterator(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 196 */                   zzb();
/* 202 */                   i1iiOl i1iiol = new i1iiOl(1);
/* 205 */                   i1iiol.I00ilI0I1 = this;
/* 211 */                   ListIterator listIterator = ((List) this.I00iiO).listIterator(i);
/* 215 */                   i1iiol.I00iio = this;
/* 219 */                   i1iiol.I00iiO = this.I00iiO;
/* 221 */                   i1iiol.I00iiI = listIterator;
/* 223 */                   VarHandle.storeStoreFence();
/* 226 */                   return i1iiol;
                        case 1:
/* 165 */                   zzb();
/* 171 */                   iIOoIIl1Ol iiooiil1ol = new iIOoIIl1Ol(4);
/* 174 */                   iiooiil1ol.I00ilI0I1 = this;
/* 180 */                   ListIterator listIterator2 = ((List) this.I00iiO).listIterator(i);
/* 184 */                   iiooiil1ol.I00iio = this;
/* 188 */                   iiooiil1ol.I00iiO = this.I00iiO;
/* 190 */                   iiooiil1ol.I00iiI = listIterator2;
/* 192 */                   VarHandle.storeStoreFence();
/* 195 */                   return iiooiil1ol;
                        case 2:
/* 134 */                   zzb();
/* 140 */                   iIolllII1 iiolllii1 = new iIolllII1(6);
/* 143 */                   iiolllii1.I00ilI0I1 = this;
/* 149 */                   ListIterator listIterator3 = ((List) this.I00iiO).listIterator(i);
/* 153 */                   iiolllii1.I00iio = this;
/* 157 */                   iiolllii1.I00iiO = this.I00iiO;
/* 159 */                   iiolllii1.I00iiI = listIterator3;
/* 161 */                   VarHandle.storeStoreFence();
/* 164 */                   return iiolllii1;
                        case 3:
/* 102 */                   zzb();
/* 109 */                   iiIo00oO iiio00oo = new iiIo00oO(9);
/* 112 */                   iiio00oo.I00ilI0I1 = this;
/* 118 */                   ListIterator listIterator4 = ((List) this.I00iiO).listIterator(i);
/* 122 */                   iiio00oo.I00iio = this;
/* 126 */                   iiio00oo.I00iiO = this.I00iiO;
/* 128 */                   iiio00oo.I00iiI = listIterator4;
/* 130 */                   VarHandle.storeStoreFence();
/* 133 */                   return iiio00oo;
                        case 4:
/* 70 */                    zzb();
/* 77 */                    li0OoIii li0ooiii = new li0OoIii(11);
/* 80 */                    li0ooiii.I00ilI0I1 = this;
/* 86 */                    ListIterator listIterator5 = ((List) this.I00iiO).listIterator(i);
/* 90 */                    li0ooiii.I00iio = this;
/* 94 */                    li0ooiii.I00iiO = this.I00iiO;
/* 96 */                    li0ooiii.I00iiI = listIterator5;
/* 98 */                    VarHandle.storeStoreFence();
/* 101 */                   return li0ooiii;
                        case 5:
/* 38 */                    zzb();
/* 45 */                    lolii000OoI lolii000ooi = new lolii000OoI(14);
/* 48 */                    lolii000ooi.I00ilI0I1 = this;
/* 54 */                    ListIterator listIterator6 = ((List) this.I00iiO).listIterator(i);
/* 58 */                    lolii000ooi.I00iio = this;
/* 62 */                    lolii000ooi.I00iiO = this.I00iiO;
/* 64 */                    lolii000ooi.I00iiI = listIterator6;
/* 66 */                    VarHandle.storeStoreFence();
/* 69 */                    return lolii000ooi;
                        default:
/* 6 */                     zzb();
/* 13 */                    loliilOOoIIl loliiloooiil = new loliilOOoIIl(15);
/* 16 */                    loliiloooiil.I00ilI0I1 = this;
/* 22 */                    ListIterator listIterator7 = ((List) this.I00iiO).listIterator(i);
/* 26 */                    loliiloooiil.I00iio = this;
/* 30 */                    loliiloooiil.I00iiO = this.I00iiO;
/* 32 */                    loliiloooiil.I00iiI = listIterator7;
/* 34 */                    VarHandle.storeStoreFence();
/* 37 */                    return loliiloooiil;
                    }
                }

                @Override
                public final Object remove(int i) {
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00io1l;
                    switch (i2) {
                        case 0:
/* 114 */                   zzb();
/* 121 */                   Object objRemove = ((List) this.I00iiO).remove(i);
/* 125 */                   I00000oOI();
/* 128 */                   return objRemove;
                        case 1:
/* 99 */                    zzb();
/* 106 */                   Object objRemove2 = ((List) this.I00iiO).remove(i);
/* 110 */                   I00000oOI();
/* 113 */                   return objRemove2;
                        case 2:
/* 76 */                    zzb();
/* 83 */                    Object objRemove3 = ((List) this.I00iiO).remove(i);
/* 87 */                    iOIoo1lI ioioo1li = (iOIoo1lI) serializable;
                            ioioo1li.I00iio--;
/* 95 */                    I00000oOI();
/* 98 */                    return objRemove3;
                        case 3:
/* 53 */                    zzb();
/* 60 */                    Object objRemove4 = ((List) this.I00iiO).remove(i);
/* 64 */                    iii1IlooII iii1ilooii = (iii1IlooII) serializable;
                            iii1ilooii.I00ilI0I1--;
/* 72 */                    I00000oOI();
/* 75 */                    return objRemove4;
                        case 4:
/* 38 */                    zzb();
/* 45 */                    Object objRemove5 = ((List) this.I00iiO).remove(i);
/* 49 */                    I00000oOI();
/* 52 */                    return objRemove5;
                        case 5:
/* 23 */                    zzb();
/* 30 */                    Object objRemove6 = ((List) this.I00iiO).remove(i);
/* 34 */                    I00000oOI();
/* 37 */                    return objRemove6;
                        default:
/* 8 */                     zzb();
/* 15 */                    Object objRemove7 = ((List) this.I00iiO).remove(i);
/* 19 */                    I00000oOI();
/* 22 */                    return objRemove7;
                    }
                }

                @Override
                public final boolean removeAll(Collection collection) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00ilO0;
/* 5 */             boolean zRemoveAll = false;
                    switch (i) {
                        case 0:
/* 195 */                   if (!collection.isEmpty()) {
/* 198 */                       size();
/* 203 */                       zRemoveAll = this.I00iiO.removeAll(collection);
/* 207 */                       if (zRemoveAll) {
/* 211 */                           this.I00iiO.size();
/* 214 */                           I00000oOI();
                                    break;
                                }
                            }
                            break;
                        case 1:
/* 168 */                   if (!collection.isEmpty()) {
/* 171 */                       size();
/* 176 */                       zRemoveAll = this.I00iiO.removeAll(collection);
/* 180 */                       if (zRemoveAll) {
/* 184 */                           this.I00iiO.size();
/* 187 */                           I00000oOI();
                                    break;
                                }
                            }
                            break;
                        case 2:
/* 131 */                   if (!collection.isEmpty()) {
/* 134 */                       int size = size();
/* 140 */                       zRemoveAll = this.I00iiO.removeAll(collection);
/* 144 */                       if (zRemoveAll) {
                                    ((iOIoo1lI) serializable).I00iio += this.I00iiO.size() - size;
/* 160 */                           I00000oOI();
                                    break;
                                }
                            }
                            break;
                        case 3:
/* 94 */                    if (!collection.isEmpty()) {
/* 97 */                        int size2 = size();
/* 103 */                       zRemoveAll = this.I00iiO.removeAll(collection);
/* 107 */                       if (zRemoveAll) {
                                    ((iii1IlooII) serializable).I00ilI0I1 += this.I00iiO.size() - size2;
/* 123 */                           I00000oOI();
                                    break;
                                }
                            }
                            break;
                        case 4:
/* 67 */                    if (!collection.isEmpty()) {
/* 70 */                        size();
/* 75 */                        zRemoveAll = this.I00iiO.removeAll(collection);
/* 79 */                        if (zRemoveAll) {
/* 83 */                            this.I00iiO.size();
/* 86 */                            I00000oOI();
                                    break;
                                }
                            }
                            break;
                        case 5:
/* 40 */                    if (!collection.isEmpty()) {
/* 43 */                        size();
/* 48 */                        zRemoveAll = this.I00iiO.removeAll(collection);
/* 52 */                        if (zRemoveAll) {
/* 56 */                            this.I00iiO.size();
/* 59 */                            I00000oOI();
                                    break;
                                }
                            }
                            break;
                        default:
/* 13 */                    if (!collection.isEmpty()) {
/* 16 */                        size();
/* 21 */                        zRemoveAll = this.I00iiO.removeAll(collection);
/* 25 */                        if (zRemoveAll) {
/* 29 */                            this.I00iiO.size();
/* 32 */                            I00000oOI();
                                    break;
                                }
                            }
                            break;
                    }
/* 35 */            return zRemoveAll;
                }

                @Override
                public final boolean retainAll(Collection collection) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 166 */                   collection.getClass();
/* 169 */                   size();
/* 174 */                   boolean zRetainAll = this.I00iiO.retainAll(collection);
/* 178 */                   if (zRetainAll) {
/* 182 */                       this.I00iiO.size();
/* 185 */                       I00000oOI();
                            }
/* 188 */                   return zRetainAll;
                        case 1:
/* 143 */                   collection.getClass();
/* 146 */                   size();
/* 151 */                   boolean zRetainAll2 = this.I00iiO.retainAll(collection);
/* 155 */                   if (zRetainAll2) {
/* 159 */                       this.I00iiO.size();
/* 162 */                       I00000oOI();
                            }
/* 165 */                   return zRetainAll2;
                        case 2:
/* 110 */                   collection.getClass();
/* 113 */                   int size = size();
/* 119 */                   boolean zRetainAll3 = this.I00iiO.retainAll(collection);
/* 123 */                   if (zRetainAll3) {
                                ((iOIoo1lI) serializable).I00iio += this.I00iiO.size() - size;
/* 139 */                       I00000oOI();
                            }
/* 142 */                   return zRetainAll3;
                        case 3:
/* 77 */                    collection.getClass();
/* 80 */                    int size2 = size();
/* 86 */                    boolean zRetainAll4 = this.I00iiO.retainAll(collection);
/* 90 */                    if (zRetainAll4) {
                                ((iii1IlooII) serializable).I00ilI0I1 += this.I00iiO.size() - size2;
/* 106 */                       I00000oOI();
                            }
/* 109 */                   return zRetainAll4;
                        case 4:
/* 54 */                    collection.getClass();
/* 57 */                    size();
/* 62 */                    boolean zRetainAll5 = this.I00iiO.retainAll(collection);
/* 66 */                    if (zRetainAll5) {
/* 70 */                        this.I00iiO.size();
/* 73 */                        I00000oOI();
                            }
/* 76 */                    return zRetainAll5;
                        case 5:
/* 31 */                    collection.getClass();
/* 34 */                    size();
/* 39 */                    boolean zRetainAll6 = this.I00iiO.retainAll(collection);
/* 43 */                    if (zRetainAll6) {
/* 47 */                        this.I00iiO.size();
/* 50 */                        I00000oOI();
                            }
/* 53 */                    return zRetainAll6;
                        default:
/* 8 */                     collection.getClass();
/* 11 */                    size();
/* 16 */                    boolean zRetainAll7 = this.I00iiO.retainAll(collection);
/* 20 */                    if (zRetainAll7) {
/* 24 */                        this.I00iiO.size();
/* 27 */                        I00000oOI();
                            }
/* 30 */                    return zRetainAll7;
                    }
                }

                @Override
                public final Object set(int i, Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 78 */                    zzb();
                            break;
                        case 1:
/* 66 */                    zzb();
                            break;
                        case 2:
/* 54 */                    zzb();
                            break;
                        case 3:
/* 42 */                    zzb();
                            break;
                        case 4:
/* 30 */                    zzb();
                            break;
                        case 5:
/* 18 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 13 */            return ((List) this.I00iiO).set(i, obj);
                }

                @Override
                public final int size() {
                    switch (this.I00iOIl) {
                        case 0:
/* 66 */                    zzb();
                            break;
                        case 1:
/* 56 */                    zzb();
                            break;
                        case 2:
/* 46 */                    zzb();
                            break;
                        case 3:
/* 36 */                    zzb();
                            break;
                        case 4:
/* 26 */                    zzb();
                            break;
                        case 5:
/* 16 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 11 */            return this.I00iiO.size();
                }

                @Override
                public final List subList(int i, int i2) {
/* 1 */             int i3 = this.I00iOIl;
/* 3 */             Serializable serializable = this.I00io1l;
/* 5 */             Object obj = this.I00iiI;
/* 7 */             AbstractCollection abstractCollection = this.I00ilI0I1;
                    switch (i3) {
                        case 0:
/* 221 */                   zzb();
/* 228 */                   List listSubList = ((List) this.I00iiO).subList(i, i2);
/* 232 */                   i1liliil11 i1liliil11Var = (i1liliil11) abstractCollection;
/* 234 */                   if (i1liliil11Var != null) {
/* 237 */                       this = i1liliil11Var;
                            }
/* 238 */                   iI1oliOIO ii1olioio = (iI1oliOIO) serializable;
                            return listSubList instanceof RandomAccess ? new o10li11li0(ii1olioio, obj, listSubList, this) : new i1liliil11(ii1olioio, obj, listSubList, this);
                        case 1:
/* 186 */                   zzb();
/* 193 */                   List listSubList2 = ((List) this.I00iiO).subList(i, i2);
/* 197 */                   i1liliil11 i1liliil11Var2 = (i1liliil11) abstractCollection;
/* 199 */                   if (i1liliil11Var2 != null) {
/* 202 */                       this = i1liliil11Var2;
                            }
/* 203 */                   iO0OOlIoo00 io0oolioo00 = (iO0OOlIoo00) serializable;
                            return listSubList2 instanceof RandomAccess ? new iI1I11iO0oi(io0oolioo00, obj, listSubList2, this) : new i1liliil11(io0oolioo00, obj, listSubList2, this);
                        case 2:
/* 152 */                   zzb();
/* 155 */                   iOIoo1lI ioioo1li = (iOIoo1lI) serializable;
/* 161 */                   List listSubList3 = ((List) this.I00iiO).subList(i, i2);
/* 165 */                   i1liliil11 i1liliil11Var3 = (i1liliil11) abstractCollection;
/* 167 */                   if (i1liliil11Var3 != null) {
/* 169 */                       this = i1liliil11Var3;
                            }
                            return listSubList3 instanceof RandomAccess ? new iIii0o1OII(ioioo1li, obj, listSubList3, this) : new i1liliil11(ioioo1li, obj, listSubList3, this);
                        case 3:
/* 117 */                   zzb();
/* 124 */                   List listSubList4 = ((List) this.I00iiO).subList(i, i2);
/* 128 */                   i1liliil11 i1liliil11Var4 = (i1liliil11) abstractCollection;
/* 130 */                   if (i1liliil11Var4 != null) {
/* 133 */                       this = i1liliil11Var4;
                            }
/* 134 */                   iii1IlooII iii1ilooii = (iii1IlooII) serializable;
                            return listSubList4 instanceof RandomAccess ? new iiI1Io(iii1ilooii, obj, listSubList4, this) : new i1liliil11(iii1ilooii, obj, listSubList4, this);
                        case 4:
/* 82 */                    zzb();
/* 89 */                    List listSubList5 = ((List) this.I00iiO).subList(i, i2);
/* 93 */                    i1liliil11 i1liliil11Var5 = (i1liliil11) abstractCollection;
/* 95 */                    if (i1liliil11Var5 != null) {
/* 98 */                        this = i1liliil11Var5;
                            }
/* 99 */                    loO1I0 loo1i0 = (loO1I0) serializable;
                            return listSubList5 instanceof RandomAccess ? new lIOl0OIo(loo1i0, obj, listSubList5, this) : new i1liliil11(loo1i0, obj, listSubList5, this);
                        case 5:
/* 47 */                    zzb();
/* 54 */                    List listSubList6 = ((List) this.I00iiO).subList(i, i2);
/* 58 */                    i1liliil11 i1liliil11Var6 = (i1liliil11) abstractCollection;
/* 60 */                    if (i1liliil11Var6 != null) {
/* 63 */                        this = i1liliil11Var6;
                            }
/* 64 */                    o10liooI o10liooi = (o10liooI) serializable;
                            return listSubList6 instanceof RandomAccess ? new lli0oiIio0(o10liooi, obj, listSubList6, this) : new i1liliil11(o10liooi, obj, listSubList6, this);
                        default:
/* 12 */                    zzb();
/* 19 */                    List listSubList7 = ((List) this.I00iiO).subList(i, i2);
/* 23 */                    i1liliil11 i1liliil11Var7 = (i1liliil11) abstractCollection;
/* 25 */                    if (i1liliil11Var7 != null) {
/* 28 */                        this = i1liliil11Var7;
                            }
/* 29 */                    o10lo0 o10lo0Var = (o10lo0) serializable;
                            return listSubList7 instanceof RandomAccess ? new lli1I1l(o10lo0Var, obj, listSubList7, this) : new i1liliil11(o10lo0Var, obj, listSubList7, this);
                    }
                }

                @Override
                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 66 */                    zzb();
                            break;
                        case 1:
/* 56 */                    zzb();
                            break;
                        case 2:
/* 46 */                    zzb();
                            break;
                        case 3:
/* 36 */                    zzb();
                            break;
                        case 4:
/* 26 */                    zzb();
                            break;
                        case 5:
/* 16 */                    zzb();
                            break;
                        default:
/* 6 */                     zzb();
                            break;
                    }
/* 11 */            return this.I00iiO.toString();
                }

                public final void zza() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
/* 5 */             Serializable serializable = this.I00ilO0;
/* 7 */             AbstractCollection abstractCollection = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 120 */                   i1liliil11 i1liliil11Var = (i1liliil11) abstractCollection;
/* 122 */                   if (i1liliil11Var == null) {
/* 134 */                       ((iI1oliOIO) serializable).I00iiO.put(obj, this.I00iiO);
                                break;
                            } else {
/* 124 */                       i1liliil11Var.zza();
                                break;
                            }
                        case 1:
/* 102 */                   i1liliil11 i1liliil11Var2 = (i1liliil11) abstractCollection;
/* 104 */                   if (i1liliil11Var2 == null) {
/* 116 */                       ((iO0OOlIoo00) serializable).I00iiO.put(obj, this.I00iiO);
                                break;
                            } else {
/* 106 */                       i1liliil11Var2.zza();
                                break;
                            }
                        case 2:
/* 84 */                    i1liliil11 i1liliil11Var3 = (i1liliil11) abstractCollection;
/* 86 */                    if (i1liliil11Var3 == null) {
/* 98 */                        ((iOIoo1lI) serializable).I00iiO.put(obj, this.I00iiO);
                                break;
                            } else {
/* 88 */                        i1liliil11Var3.zza();
                                break;
                            }
                        case 3:
/* 66 */                    i1liliil11 i1liliil11Var4 = (i1liliil11) abstractCollection;
/* 68 */                    if (i1liliil11Var4 == null) {
/* 80 */                        ((iii1IlooII) serializable).I00iio.put(obj, this.I00iiO);
                                break;
                            } else {
/* 70 */                        i1liliil11Var4.zza();
                                break;
                            }
                        case 4:
/* 48 */                    i1liliil11 i1liliil11Var5 = (i1liliil11) abstractCollection;
/* 50 */                    if (i1liliil11Var5 == null) {
/* 62 */                        ((loO1I0) serializable).I00iiO.put(obj, this.I00iiO);
                                break;
                            } else {
/* 52 */                        i1liliil11Var5.zza();
                                break;
                            }
                        case 5:
/* 30 */                    i1liliil11 i1liliil11Var6 = (i1liliil11) abstractCollection;
/* 32 */                    if (i1liliil11Var6 == null) {
/* 44 */                        ((o10liooI) serializable).I00iiO.put(obj, this.I00iiO);
                                break;
                            } else {
/* 34 */                        i1liliil11Var6.zza();
                                break;
                            }
                        default:
/* 12 */                    i1liliil11 i1liliil11Var7 = (i1liliil11) abstractCollection;
/* 14 */                    if (i1liliil11Var7 == null) {
/* 26 */                        ((o10lo0) serializable).I00iiO.put(obj, this.I00iiO);
                                break;
                            } else {
/* 16 */                        i1liliil11Var7.zza();
                                break;
                            }
                    }
                }

                public final void zzb() {
                    Collection collection;
                    Collection collection2;
                    Collection collection3;
                    Collection collection4;
                    Collection collection5;
                    Collection collection6;
                    Collection collection7;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
/* 5 */             Serializable serializable = this.I00ilO0;
/* 7 */             Collection collection8 = this.I00iio;
/* 9 */             AbstractCollection abstractCollection = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 248 */                   i1liliil11 i1liliil11Var = (i1liliil11) abstractCollection;
/* 250 */                   if (i1liliil11Var == null) {
/* 270 */                       if (this.I00iiO.isEmpty() && (collection = (Collection) ((iI1oliOIO) serializable).I00iiO.get(obj)) != null) {
/* 284 */                           this.I00iiO = collection;
                                    break;
                                }
                            } else {
/* 252 */                       i1liliil11Var.zzb();
/* 257 */                       if (i1liliil11Var.I00iiO != collection8) {
/* 260 */                           I000II.I001IIilI0O();
                                    break;
                                }
                            }
                            break;
                        case 1:
/* 209 */                   i1liliil11 i1liliil11Var2 = (i1liliil11) abstractCollection;
/* 211 */                   if (i1liliil11Var2 == null) {
/* 231 */                       if (this.I00iiO.isEmpty() && (collection2 = (Collection) ((iO0OOlIoo00) serializable).I00iiO.get(obj)) != null) {
/* 245 */                           this.I00iiO = collection2;
                                    break;
                                }
                            } else {
/* 213 */                       i1liliil11Var2.zzb();
/* 218 */                       if (i1liliil11Var2.I00iiO != collection8) {
/* 221 */                           I000II.I001IIilI0O();
                                    break;
                                }
                            }
                            break;
                        case 2:
/* 170 */                   i1liliil11 i1liliil11Var3 = (i1liliil11) abstractCollection;
/* 172 */                   if (i1liliil11Var3 == null) {
/* 192 */                       if (this.I00iiO.isEmpty() && (collection3 = (Collection) ((iOIoo1lI) serializable).I00iiO.get(obj)) != null) {
/* 206 */                           this.I00iiO = collection3;
                                    break;
                                }
                            } else {
/* 174 */                       i1liliil11Var3.zzb();
/* 179 */                       if (i1liliil11Var3.I00iiO != collection8) {
/* 182 */                           I000II.I001IIilI0O();
                                    break;
                                }
                            }
                            break;
                        case 3:
/* 131 */                   i1liliil11 i1liliil11Var4 = (i1liliil11) abstractCollection;
/* 133 */                   if (i1liliil11Var4 == null) {
/* 153 */                       if (this.I00iiO.isEmpty() && (collection4 = (Collection) ((iii1IlooII) serializable).I00iio.get(obj)) != null) {
/* 167 */                           this.I00iiO = collection4;
                                    break;
                                }
                            } else {
/* 135 */                       i1liliil11Var4.zzb();
/* 140 */                       if (i1liliil11Var4.I00iiO != collection8) {
/* 143 */                           I000II.I001IIilI0O();
                                    break;
                                }
                            }
                            break;
                        case 4:
/* 92 */                    i1liliil11 i1liliil11Var5 = (i1liliil11) abstractCollection;
/* 94 */                    if (i1liliil11Var5 == null) {
/* 114 */                       if (this.I00iiO.isEmpty() && (collection5 = (Collection) ((loO1I0) serializable).I00iiO.get(obj)) != null) {
/* 128 */                           this.I00iiO = collection5;
                                    break;
                                }
                            } else {
/* 96 */                        i1liliil11Var5.zzb();
/* 101 */                       if (i1liliil11Var5.I00iiO != collection8) {
/* 104 */                           I000II.I001IIilI0O();
                                    break;
                                }
                            }
                            break;
                        case 5:
/* 53 */                    i1liliil11 i1liliil11Var6 = (i1liliil11) abstractCollection;
/* 55 */                    if (i1liliil11Var6 == null) {
/* 75 */                        if (this.I00iiO.isEmpty() && (collection6 = (Collection) ((o10liooI) serializable).I00iiO.get(obj)) != null) {
/* 89 */                            this.I00iiO = collection6;
                                    break;
                                }
                            } else {
/* 57 */                        i1liliil11Var6.zzb();
/* 62 */                        if (i1liliil11Var6.I00iiO != collection8) {
/* 65 */                            I000II.I001IIilI0O();
                                    break;
                                }
                            }
                            break;
                        default:
/* 14 */                    i1liliil11 i1liliil11Var7 = (i1liliil11) abstractCollection;
/* 16 */                    if (i1liliil11Var7 == null) {
/* 36 */                        if (this.I00iiO.isEmpty() && (collection7 = (Collection) ((o10lo0) serializable).I00iiO.get(obj)) != null) {
/* 50 */                            this.I00iiO = collection7;
                                    break;
                                }
                            } else {
/* 18 */                        i1liliil11Var7.zzb();
/* 23 */                        if (i1liliil11Var7.I00iiO != collection8) {
/* 26 */                            I000II.I001IIilI0O();
                                    break;
                                }
                            }
                            break;
                    }
                }

/* 25 */        public i1liliil11(iO0OOlIoo00 io0oolioo00, Object obj, List list, i1liliil11 i1liliil11Var) {
/* 26 */            this.I00io1l = io0oolioo00;
/* 27 */            this.I00ilO0 = io0oolioo00;
                    this.I00iiI = obj;
                    this.I00iiO = list;
                    this.I00ilI0I1 = i1liliil11Var;
                    this.I00iio = i1liliil11Var == null ? null : i1liliil11Var.I00iiO;
                }

/* 27 */        public i1liliil11(iOIoo1lI ioioo1li, Object obj, List list, i1liliil11 i1liliil11Var) {
/* 28 */            this.I00io1l = ioioo1li;
/* 29 */            this.I00ilO0 = ioioo1li;
                    this.I00iiI = obj;
                    this.I00iiO = list;
                    this.I00ilI0I1 = i1liliil11Var;
                    this.I00iio = i1liliil11Var == null ? null : i1liliil11Var.I00iiO;
                }

/* 29 */        public i1liliil11(iii1IlooII iii1ilooii, Object obj, List list, i1liliil11 i1liliil11Var) {
/* 30 */            this.I00io1l = iii1ilooii;
/* 31 */            this.I00ilO0 = iii1ilooii;
                    this.I00iiI = obj;
                    this.I00iiO = list;
                    this.I00ilI0I1 = i1liliil11Var;
                    this.I00iio = i1liliil11Var == null ? null : i1liliil11Var.I00iiO;
                }

/* 31 */        public i1liliil11(loO1I0 loo1i0, Object obj, List list, i1liliil11 i1liliil11Var) {
/* 32 */            this.I00io1l = loo1i0;
/* 33 */            this.I00ilO0 = loo1i0;
                    this.I00iiI = obj;
                    this.I00iiO = list;
                    this.I00ilI0I1 = i1liliil11Var;
                    this.I00iio = i1liliil11Var == null ? null : i1liliil11Var.I00iiO;
                }

/* 33 */        public i1liliil11(o10liooI o10liooi, Object obj, List list, i1liliil11 i1liliil11Var) {
/* 34 */            this.I00io1l = o10liooi;
/* 35 */            this.I00ilO0 = o10liooi;
                    this.I00iiI = obj;
                    this.I00iiO = list;
                    this.I00ilI0I1 = i1liliil11Var;
                    this.I00iio = i1liliil11Var == null ? null : i1liliil11Var.I00iiO;
                }

/* 35 */        public i1liliil11(o10lo0 o10lo0Var, Object obj, List list, i1liliil11 i1liliil11Var) {
/* 36 */            this.I00io1l = o10lo0Var;
/* 37 */            this.I00ilO0 = o10lo0Var;
                    this.I00iiI = obj;
                    this.I00iiO = list;
                    this.I00ilI0I1 = i1liliil11Var;
                    this.I00iio = i1liliil11Var == null ? null : i1liliil11Var.I00iiO;
                }

                @Override
/* 128 */       public final boolean remove(Object obj) {
                    int i = this.I00iOIl;
                    Serializable serializable = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 150 */                   zzb();
/* 151 */                   boolean zRemove = this.I00iiO.remove(obj);
                            if (zRemove) {
/* 152 */                       I00000oOI();
                            }
                            return zRemove;
                        case 1:
/* 147 */                   zzb();
/* 148 */                   boolean zRemove2 = this.I00iiO.remove(obj);
                            if (zRemove2) {
/* 149 */                       I00000oOI();
                            }
                            return zRemove2;
                        case 2:
/* 143 */                   zzb();
/* 144 */                   boolean zRemove3 = this.I00iiO.remove(obj);
                            if (zRemove3) {
                                iOIoo1lI ioioo1li = (iOIoo1lI) serializable;
                                ioioo1li.I00iio--;
/* 146 */                       I00000oOI();
                            }
                            return zRemove3;
                        case 3:
/* 138 */                   zzb();
/* 139 */                   boolean zRemove4 = this.I00iiO.remove(obj);
                            if (zRemove4) {
                                iii1IlooII iii1ilooii = (iii1IlooII) serializable;
                                iii1ilooii.I00ilI0I1--;
/* 142 */                       I00000oOI();
                            }
                            return zRemove4;
                        case 4:
/* 135 */                   zzb();
/* 136 */                   boolean zRemove5 = this.I00iiO.remove(obj);
                            if (zRemove5) {
/* 137 */                       I00000oOI();
                            }
                            return zRemove5;
                        case 5:
/* 132 */                   zzb();
/* 133 */                   boolean zRemove6 = this.I00iiO.remove(obj);
                            if (zRemove6) {
/* 134 */                       I00000oOI();
                            }
                            return zRemove6;
                        default:
/* 129 */                   zzb();
/* 130 */                   boolean zRemove7 = this.I00iiO.remove(obj);
                            if (zRemove7) {
/* 131 */                       I00000oOI();
                            }
                            return zRemove7;
                    }
                }

                @Override
/* 198 */       public final void add(int i, Object obj) {
                    int i2 = this.I00iOIl;
                    Serializable serializable = this.I00io1l;
                    switch (i2) {
                        case 0:
/* 232 */                   zzb();
/* 233 */                   boolean zIsEmpty = this.I00iiO.isEmpty();
/* 235 */                   ((List) this.I00iiO).add(i, obj);
                            if (zIsEmpty) {
/* 236 */                       zza();
                                break;
                            }
                            break;
                        case 1:
/* 227 */                   zzb();
/* 228 */                   boolean zIsEmpty2 = this.I00iiO.isEmpty();
/* 230 */                   ((List) this.I00iiO).add(i, obj);
                            if (zIsEmpty2) {
/* 231 */                       zza();
                                break;
                            }
                            break;
                        case 2:
/* 221 */                   zzb();
/* 222 */                   boolean zIsEmpty3 = this.I00iiO.isEmpty();
/* 224 */                   ((List) this.I00iiO).add(i, obj);
                            ((iOIoo1lI) serializable).I00iio++;
                            if (zIsEmpty3) {
/* 226 */                       zza();
                                break;
                            }
                            break;
                        case 3:
/* 214 */                   zzb();
/* 215 */                   boolean zIsEmpty4 = this.I00iiO.isEmpty();
/* 217 */                   ((List) this.I00iiO).add(i, obj);
                            ((iii1IlooII) serializable).I00ilI0I1++;
                            if (zIsEmpty4) {
/* 220 */                       zza();
                                break;
                            }
                            break;
                        case 4:
/* 209 */                   zzb();
/* 210 */                   boolean zIsEmpty5 = this.I00iiO.isEmpty();
/* 212 */                   ((List) this.I00iiO).add(i, obj);
                            if (zIsEmpty5) {
/* 213 */                       zza();
                                break;
                            }
                            break;
                        case 5:
/* 204 */                   zzb();
/* 205 */                   boolean zIsEmpty6 = this.I00iiO.isEmpty();
/* 207 */                   ((List) this.I00iiO).add(i, obj);
                            if (zIsEmpty6) {
/* 208 */                       zza();
                                break;
                            }
                            break;
                        default:
/* 199 */                   zzb();
/* 200 */                   boolean zIsEmpty7 = this.I00iiO.isEmpty();
/* 202 */                   ((List) this.I00iiO).add(i, obj);
                            if (zIsEmpty7) {
/* 203 */                       zza();
                                break;
                            }
                            break;
                    }
                }

                @Override
/* 226 */       public final ListIterator listIterator() {
                    switch (this.I00iOIl) {
                        case 0:
/* 239 */                   zzb();
/* 240 */                   return new i1iiOl(this);
                        case 1:
/* 237 */                   zzb();
/* 238 */                   return new iIOoIIl1Ol(this);
                        case 2:
/* 235 */                   zzb();
/* 236 */                   return new iIolllII1(this);
                        case 3:
/* 233 */                   zzb();
/* 234 */                   return new iiIo00oO(this);
                        case 4:
/* 231 */                   zzb();
/* 232 */                   return new li0OoIii(this);
                        case 5:
/* 229 */                   zzb();
/* 230 */                   return new lolii000OoI(this);
                        default:
/* 227 */                   zzb();
/* 228 */                   return new loliilOOoIIl(this);
                    }
                }

                @Override
/* 272 */       public final boolean addAll(Collection collection) {
                    int i = this.I00iOIl;
                    Serializable serializable = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 306 */                   if (collection.isEmpty()) {
                                return false;
                            }
/* 307 */                   int size = size();
/* 308 */                   boolean zAddAll = this.I00iiO.addAll(collection);
                            if (zAddAll) {
/* 309 */                       this.I00iiO.size();
                                if (size == 0) {
/* 310 */                           zza();
                                    return true;
                                }
                            }
                            return zAddAll;
                        case 1:
/* 301 */                   if (collection.isEmpty()) {
                                return false;
                            }
/* 302 */                   int size2 = size();
/* 303 */                   boolean zAddAll2 = this.I00iiO.addAll(collection);
                            if (zAddAll2) {
/* 304 */                       this.I00iiO.size();
                                if (size2 == 0) {
/* 305 */                           zza();
                                    return true;
                                }
                            }
                            return zAddAll2;
                        case 2:
/* 295 */                   if (collection.isEmpty()) {
                                return false;
                            }
/* 296 */                   int size3 = size();
/* 297 */                   boolean zAddAll3 = this.I00iiO.addAll(collection);
                            if (zAddAll3) {
                                ((iOIoo1lI) serializable).I00iio += this.I00iiO.size() - size3;
                                if (size3 == 0) {
/* 300 */                           zza();
                                    return true;
                                }
                            }
                            return zAddAll3;
                        case 3:
/* 288 */                   if (collection.isEmpty()) {
                                return false;
                            }
/* 289 */                   int size4 = size();
/* 290 */                   boolean zAddAll4 = this.I00iiO.addAll(collection);
                            if (zAddAll4) {
                                ((iii1IlooII) serializable).I00ilI0I1 += this.I00iiO.size() - size4;
                                if (size4 == 0) {
/* 294 */                           zza();
                                    return true;
                                }
                            }
                            return zAddAll4;
                        case 4:
/* 283 */                   if (collection.isEmpty()) {
                                return false;
                            }
/* 284 */                   int size5 = size();
/* 285 */                   boolean zAddAll5 = this.I00iiO.addAll(collection);
                            if (zAddAll5) {
/* 286 */                       this.I00iiO.size();
                                if (size5 == 0) {
/* 287 */                           zza();
                                    return true;
                                }
                            }
                            return zAddAll5;
                        case 5:
/* 278 */                   if (collection.isEmpty()) {
                                return false;
                            }
/* 279 */                   int size6 = size();
/* 280 */                   boolean zAddAll6 = this.I00iiO.addAll(collection);
                            if (zAddAll6) {
/* 281 */                       this.I00iiO.size();
                                if (size6 == 0) {
/* 282 */                           zza();
                                    return true;
                                }
                            }
                            return zAddAll6;
                        default:
/* 273 */                   if (collection.isEmpty()) {
                                return false;
                            }
/* 274 */                   int size7 = size();
/* 275 */                   boolean zAddAll7 = this.I00iiO.addAll(collection);
                            if (zAddAll7) {
/* 276 */                       this.I00iiO.size();
                                if (size7 == 0) {
/* 277 */                           zza();
                                    return true;
                                }
                            }
                            return zAddAll7;
                    }
                }
            }
