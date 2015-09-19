package org.cx.model;

import java.util.Date;

public class Item {
    private Integer id;

    private String itemName;

    private String itemDesc;

    private String itemSmallImg;

    private String itemBigImg;

    private String price;
    
    private String type;
    
    private Integer skuNum;

    private Integer itemRank;

    private Date createTime;

    private Date updateTime;

    private Integer version;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getItemDesc() {
			return itemDesc;
		}

		public void setItemDesc(String itemDesc) {
			this.itemDesc = itemDesc;
		}

		public String getItemSmallImg() {
			return itemSmallImg;
		}

		public void setItemSmallImg(String itemSmallImg) {
			this.itemSmallImg = itemSmallImg;
		}

		public String getItemBigImg() {
			return itemBigImg;
		}

		public void setItemBigImg(String itemBigImg) {
			this.itemBigImg = itemBigImg;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public Integer getSkuNum() {
			return skuNum;
		}

		public void setSkuNum(Integer skuNum) {
			this.skuNum = skuNum;
		}

		public Integer getItemRank() {
			return itemRank;
		}

		public void setItemRank(Integer itemRank) {
			this.itemRank = itemRank;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}

		public Date getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getVersion() {
			return version;
		}

		public void setVersion(Integer version) {
			this.version = version;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

}